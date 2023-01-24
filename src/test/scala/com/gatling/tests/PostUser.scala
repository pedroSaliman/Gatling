package com.gatling.tests

//import io.gatling.core.Predef.{Simulation, configuration, scenario}
import io.gatling.http.Predef.http
import io.gatling.http.Predef._

import io.gatling.core.Predef._


class PostUser extends Simulation{

  val httpProtocol = http
    .baseUrl("https://reqres.in")
  val scn=scenario("Post Api")

    .exec(http("Post Single User")
      .post("https://reqres.in/api/users")
      .header("content-type","application/json").asJson
      .body(RawFileBody("data/users.json")).asJson

      .check(
        status.is(201)
      )

    )
    .pause(1)

  val Updateuser=scenario("put Api")
    .exec(http("put user")
      .put("https://reqres.in/api/users/2")
      .header("content-type","application/json").asJson
      .body(RawFileBody("data/users.json")).asJson
      check(
      status.is(200),
      jsonPath("$.name") is "walled"
    )

    )

    .pause(1)


  val Deleteuser=scenario("Delete Api")
    .exec(http("Delete user")
      .delete("https://reqres.in/api/users/2")

      check(
      status.is(204)

    )

    )

    .pause(1)




  setUp(

    scn.inject(rampUsers(10).during(5)),
    Updateuser.inject(rampUsers(10).during(5)),
    Deleteuser.inject(rampUsers(10).during(5))
      .protocols(httpProtocol)

  )
}
