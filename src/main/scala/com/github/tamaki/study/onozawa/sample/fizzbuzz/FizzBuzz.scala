package com.github.tamaki.study.onozawa.sample.fizzbuzz

import scala.util.matching.Regex.Match

/**
 * Created by kohsaku.onozawa on 2015/02/09.
 */
object FizzBuzz {
  def main(args: Array[String]) {
    val list = 1 to 100
    list.foreach(print)
  }
  def print(i : Int) = {
      i match {
        case `i` if i % 3 == 0 && i % 5 == 0 => println("FizzBuzz")
        case `i` if i % 3 == 0 => println("Fizz")
        case `i` if i % 5 == 0 => println("Buzz")
        case _ => println(i)
      }
  }
}
