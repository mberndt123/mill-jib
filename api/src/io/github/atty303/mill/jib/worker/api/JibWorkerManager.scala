package io.github.atty303.mill.jib.worker.api

import mill.api.{TaskCtx, PathRef}

trait JibWorkerManager {
  def get(toolClasspath: Seq[PathRef])(using TaskCtx): JibWorker
}
