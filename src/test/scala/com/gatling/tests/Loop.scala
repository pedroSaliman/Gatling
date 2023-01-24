package com.gatling.tests

import io.gatling.core.scenario.Simulation
import io.gatling.http.Predef.http
import io.gatling.http.Predef._

import io.gatling.core.Predef._

class Loop extends Simulation{
  val httpProtocol = http
    .baseUrl("https://reqres.in")
    .header("content-type",value = "application/json")

  def getsingleuser()={
    repeat(2)
    {
      exec(http("Get Single User").get("/api/users?page=2")
        .check(
          status.is(200)
        )

      )
    }
  }
  def getalluser()={
    repeat(2){
      exec(http("Get Single User").get("/api/users/2")
        .check(
          status.is(200)
        )

      )
    }
  }
  val scn=scenario("Repeat")
  .exec(getsingleuser())
    .pause(2)
  .exec(getalluser())

  setUp(scn.inject(rampUsers(7).during(5)).protocols(httpProtocol))
}
