package com.github.tamaki.study.onozawa.sample.fizzbuzz

import scala.util.matching.Regex.Match

/**
 * Created by kohsaku.onozawa on 2015/02/09.
 */
object FizzBuzz {
  def main(args: Array[String]) {
    val list = 1 to 100
    list.filterNot(n => n % 2 == 0).foreach(print)
  }
  def print(i : Int) = {
      i match {
        case n if n % 15 == 0 => println("FizzBuzz")
        case n if n % 3 == 0 => println("Fizz")
        case n if n % 5 == 0 => println("Buzz")
        case n => println(n)
      }
  }
}
