package com.gatling.tests

//import io.gatling.core.Predef.{Simulation, configuration, scenario}
import io.gatling.http.Predef.http
import io.gatling.http.Predef._

import io.gatling.core.Predef._


class ApiGet extends Simulation{

  val httpProtocol = http
    .baseUrl("https://reqres.in")
  val scn=scenario("Get Api")

    .exec(http("Get Single User").get("/api/users/2")

      .check(
status.is(200)
      )

    )
    .pause(1)

  setUp(
    scn.inject(rampUsers(10).during(5))
      .protocols(httpProtocol)

  )
}
