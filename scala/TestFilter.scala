package com.icbc.test

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

object TestFilter {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("sessiontest").setMaster("local[*]")
    val sparkSession = SparkSession.builder().config(conf).enableHiveSupport().getOrCreate()
    val rdd = sparkSession.sparkContext.parallelize(Array(1,2,3,5))
    rdd.filter(ele=>ele%2==0).foreach(println(_))

  }

}
