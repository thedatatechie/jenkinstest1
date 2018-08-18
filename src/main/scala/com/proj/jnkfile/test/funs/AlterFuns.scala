package com.proj.jnkfile.test.funs

import com.proj.jnkfile.test.entities.Item
import org.apache.spark.sql.{DataFrame, SparkSession}

object AlterFuns {

  def addStr(x: String, y: String): String = {
    x+y
  }

  def addObj(x: Int): Int = {
    val ob1 = new MathFunc()
    ob1.add(x,5)
  }

  def modDF(spark: SparkSession, df: DataFrame): DataFrame = {
    import spark.implicits._

    df.map(x => Item(add(x.get(1).asInstanceOf[Int],5))).toDF()
  }

  def add(x: Int, y: Int): Int = {
    val ob1 = new MathFunc()
    ob1.add(x,y)
  }

}
