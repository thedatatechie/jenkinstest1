package com.proj.jnkfile.test

import com.proj.jnkfile.test.entities.Item
import com.proj.jnkfile.test.funs.{AlterFuns, MathFunc}
import org.apache.spark.sql.{Row, SparkSession}


class Main {
  def run(args: Array[String]): Unit = {

    val spark: SparkSession = SparkSession
      .builder()
      .master("local[*]")
      .appName("JenkinsTests")
      .config("spark.sql.crossJoin.enabled", value = true)
      .config("spark.default.parallelism",2)
      .config("spark.sql.shuffle.partitions",2)
      .getOrCreate()

    import spark.implicits._

    val seqDF = Seq(
      ("john",25),
      ("Ali",32),
      ("madhan",43)
    ).toDF("name", "age")


    val seqDFUpdt = AlterFuns.modDF(spark,seqDF)

    seqDFUpdt.collect().foreach(println)
  }
}
object Main {

  def main(args: Array[String]): Unit = {
    new Main().run(args)
  }

}
