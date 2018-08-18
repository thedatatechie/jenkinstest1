package com.proj.jnkfile.test.funs

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FlatSpec, Matchers}

@RunWith(classOf[JUnitRunner])
class AlterFunsSpec extends FlatSpec with Matchers {

  "add numbers" should "add two numbers" in{
    val result = AlterFuns.add(10,5)
    val expected = 15
    result should be (expected)
  }

  "add numbers str" should "add two numbers str" in{
    val result = AlterFuns.addStr("one ","two")
    val expected = "one two"
    result should be (expected)
  }

}
