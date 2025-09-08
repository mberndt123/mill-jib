package io.github.atty303.mill.jib

import io.github.atty303.mill.jib.worker.api.JibWorkerManager
import mill.T
import mill.api.{Discover, ExternalModule, Module, Task}

trait JibWorkerModule extends Module {
  def jibWorkerManager: Task.Worker[JibWorkerManager] = Task.Worker {
    new JibInJvmWorkerManager(Task.ctx())
  }
}

object JibWorkerModule extends ExternalModule with JibWorkerModule {
  lazy val millDiscover = Discover[this.type]
}
