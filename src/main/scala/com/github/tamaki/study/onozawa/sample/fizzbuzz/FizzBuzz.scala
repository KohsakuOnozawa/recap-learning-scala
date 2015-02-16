package com.github.tamaki.study.onozawa.sample.fizzbuzz

/**
 * Created by kohsaku.onozawa on 2015/02/09.
 */
object FizzBuzz {
  def main(args: Array[String]) {
    val list = 1 to 100
    val s = list.map(toFizzBuzz).mkString(",")
    println(s)
  }
  def toFizzBuzz(i : Int): String = {
      i match {
        case n if n % 15 == 0 => "FizzBuzz"
        case n if n % 3 == 0 => "Fizz"
        case n if n % 5 == 0 => "Buzz"
        case n => n.toString
      }
  }
}
