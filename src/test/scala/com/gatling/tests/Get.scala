package com.gatling.tests

//import io.gatling.core.Predef.{Simulation, configuration, scenario}
import io.gatling.http.Predef.http
import io.gatling.http.Predef._

import io.gatling.core.Predef._


class Get extends Simulation{
/////////////http config
  val httpProtocol = http
    .baseUrl("https://reqres.in")
    .header("content-type",value = "application/json")

/////////////////   scenario
  val GetList=scenario("Get Users")

    .exec(http("Get Single User").get("/api/users?page=2")

      .check(
        status.is(200)
      )

    )
    .pause(1)

  /////////////////////////Another scenario



    .exec(http("single user").get("/api/users/2")
      .check(status is 200)

    )
    .pause(1)


    .exec(http("single user not found").get("/api/users/23")
      .check(status is 404)

    )


    .pause(1)


    .exec(http("single resources ").get("/api/unknown/2")
      .check(status is 200,
        jsonPath("$.data.name") is "fuchsia rose"

      )

    )






/////////////////////////////setup




  setUp(
    GetList.inject(rampUsers(10).during(5)).protocols(httpProtocol)
  )
}
