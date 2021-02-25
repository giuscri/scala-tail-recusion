package main

import cats.effect._
import com.typesafe.scalalogging.LazyLogging

object Main extends IOApp with LazyLogging {

	def f(): Int = {
		val x = List.fill(1000000)(List(1)).flatten // Generate a 1M numbers list
		1 + f()
	}

	def run(args: List[String]): IO[ExitCode] = {
		f()

		IO.pure(ExitCode.Error)
	}

}
