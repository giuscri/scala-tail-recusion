package main

import cats.effect._

object Main extends IOApp {

	def run(args: List[String]): IO[ExitCode] = {
		IO(println("Hello!")).as(ExitCode.Success)
	}

}
