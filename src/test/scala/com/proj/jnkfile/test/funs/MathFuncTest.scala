package com.proj.jnkfile.test.funs

import org.junit.runner.RunWith
import org.scalatest.{FunSuite, Matchers}
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MathFuncTest extends FunSuite with Matchers{

  test("testAdd") {
    val ob1 = new MathFunc()
    val result = ob1.add(3,5)
    val expected = 8
    result should be (expected)
  }

  test("testMult") {
    val ob1 = new MathFunc()
    val result = ob1.mult(3,5)
    val expected = 15
    result should be (expected)
  }

}
