package com.gatling.tests

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseUrl("https://naveenautomationlabs.com")
		.inferHtmlResources()

	val headers_0 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9,ar;q=0.8",
		"sec-ch-ua" -> """Not_A Brand";v="99", "Google Chrome";v="109", "Chromium";v="109""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "document",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "none",
		"sec-fetch-user" -> "?1",
		"upgrade-insecure-requests" -> "1",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36")

	val headers_1 = Map(
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36",
		"sec-ch-ua" -> """Not_A Brand";v="99", "Google Chrome";v="109", "Chromium";v="109""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_34 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9,ar;q=0.8",
		"sec-ch-ua" -> """Not_A Brand";v="99", "Google Chrome";v="109", "Chromium";v="109""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "document",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "same-origin",
		"sec-fetch-user" -> "?1",
		"upgrade-insecure-requests" -> "1",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36")

	val headers_43 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9,ar;q=0.8",
		"sec-ch-ua" -> """Not_A Brand";v="99", "Google Chrome";v="109", "Chromium";v="109""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36")

	val headers_48 = Map(
		"accept" -> "application/json, text/javascript, */*; q=0.01",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9,ar;q=0.8",
		"content-type" -> "application/x-www-form-urlencoded; charset=UTF-8",
		"origin" -> "https://naveenautomationlabs.com",
		"sec-ch-ua" -> """Not_A Brand";v="99", "Google Chrome";v="109", "Chromium";v="109""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_49 = Map(
		"accept" -> "text/html, */*; q=0.01",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9,ar;q=0.8",
		"sec-ch-ua" -> """Not_A Brand";v="99", "Google Chrome";v="109", "Chromium";v="109""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_56 = Map(
		"accept" -> "application/json, text/javascript, */*; q=0.01",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9,ar;q=0.8",
		"sec-ch-ua" -> """Not_A Brand";v="99", "Google Chrome";v="109", "Chromium";v="109""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36",
		"x-requested-with" -> "XMLHttpRequest")

    val uri1 = "https://fonts.gstatic.com/s/opensans/v34/memvYaGs126MiZpBA-UvWbX2vVnXBbObj2OVTS-muw.woff2"
    val uri2 = "https://fonts.googleapis.com/css"

	val scn = scenario("RecordedSimulation")
		.exec(http("request_0")
			.get("/opencart/")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/opencart/catalog/view/javascript/jquery/jquery-2.1.1.min.js")
			.headers(headers_1),
            http("request_2")
			.get("/opencart/catalog/view/javascript/bootstrap/css/bootstrap.min.css")
			.headers(headers_1),
            http("request_3")
			.get("/opencart/catalog/view/javascript/bootstrap/js/bootstrap.min.js")
			.headers(headers_1),
            http("request_4")
			.get("/opencart/catalog/view/javascript/font-awesome/css/font-awesome.min.css")
			.headers(headers_1),
            http("request_5")
			.get(uri2 + "?family=Open+Sans:400,400i,300,700")
			.headers(headers_1),
            http("request_6")
			.get("/opencart/catalog/view/theme/default/stylesheet/stylesheet.css")
			.headers(headers_1),
            http("request_7")
			.get("/opencart/catalog/view/javascript/jquery/swiper/css/swiper.min.css")
			.headers(headers_1),
            http("request_8")
			.get("/opencart/catalog/view/javascript/jquery/swiper/css/opencart.css")
			.headers(headers_1),
            http("request_9")
			.get("/opencart/catalog/view/javascript/jquery/swiper/js/swiper.jquery.min.js")
			.headers(headers_1),
            http("request_10")
			.get("/opencart/catalog/view/javascript/common.js")
			.headers(headers_1),
            http("request_11")
			.get("/opencart/image/catalog/opencart-logo.png")
			.headers(headers_1),
            http("request_12")
			.get("/opencart/image/cache/catalog/demo/banners/iPhone6-1140x380.jpg")
			.headers(headers_1),
            http("request_13")
			.get("/opencart/image/cache/catalog/demo/banners/MacBookAir-1140x380.jpg")
			.headers(headers_1),
            http("request_14")
			.get("/opencart/image/cache/catalog/demo/macbook_1-200x200.jpg")
			.headers(headers_1),
            http("request_15")
			.get("/opencart/image/cache/catalog/demo/iphone_1-200x200.jpg")
			.headers(headers_1),
            http("request_16")
			.get("/opencart/image/cache/catalog/demo/apple_cinema_30-200x200.jpg")
			.headers(headers_1),
            http("request_17")
			.get("/opencart/image/cache/catalog/demo/canon_eos_5d_1-200x200.jpg")
			.headers(headers_1),
            http("request_18")
			.get("/opencart/image/cache/catalog/demo/manufacturer/nfl-130x100.png")
			.headers(headers_1),
            http("request_19")
			.get("/opencart/image/cache/catalog/demo/manufacturer/redbull-130x100.png")
			.headers(headers_1),
            http("request_20")
			.get("/opencart/image/cache/catalog/demo/manufacturer/sony-130x100.png")
			.headers(headers_1),
            http("request_21")
			.get("/opencart/image/cache/catalog/demo/manufacturer/cocacola-130x100.png")
			.headers(headers_1),
            http("request_22")
			.get("/opencart/image/cache/catalog/demo/manufacturer/burgerking-130x100.png")
			.headers(headers_1),
            http("request_23")
			.get("/opencart/image/cache/catalog/demo/manufacturer/canon-130x100.png")
			.headers(headers_1),
            http("request_24")
			.get("/opencart/image/cache/catalog/demo/manufacturer/harley-130x100.png")
			.headers(headers_1),
            http("request_25")
			.get("/opencart/image/cache/catalog/demo/manufacturer/dell-130x100.png")
			.headers(headers_1),
            http("request_26")
			.get("/opencart/image/cache/catalog/demo/manufacturer/disney-130x100.png")
			.headers(headers_1),
            http("request_27")
			.get("/opencart/image/cache/catalog/demo/manufacturer/starbucks-130x100.png")
			.headers(headers_1),
            http("request_28")
			.get("/opencart/image/cache/catalog/demo/manufacturer/nintendo-130x100.png")
			.headers(headers_1),
            http("request_29")
			.get("/opencart/catalog/view/javascript/font-awesome/fonts/fontawesome-webfont.woff2?v=4.7.0"),
            http("request_30")
			.get(uri1),
            http("request_31")
			.get(uri1),
            http("request_32")
			.get(uri1),
            http("request_33")
			.get("/opencart/image/catalog/cart.png")))
		.pause(7)
		.exec(http("request_34")
			.get("/opencart/index.php?route=product/search&search=Iphone")
			.headers(headers_34)
			.resources(http("request_35")
			.get("/opencart/catalog/view/javascript/jquery/jquery-2.1.1.min.js")
			.headers(headers_1),
            http("request_36")
			.get("/opencart/catalog/view/javascript/bootstrap/css/bootstrap.min.css")
			.headers(headers_1),
            http("request_37")
			.get("/opencart/catalog/view/javascript/bootstrap/js/bootstrap.min.js")
			.headers(headers_1),
            http("request_38")
			.get("/opencart/catalog/view/javascript/font-awesome/css/font-awesome.min.css")
			.headers(headers_1),
            http("request_39")
			.get(uri2 + "?family=Open+Sans:400,400i,300,700")
			.headers(headers_1),
            http("request_40")
			.get("/opencart/catalog/view/theme/default/stylesheet/stylesheet.css")
			.headers(headers_1),
            http("request_41")
			.get("/opencart/catalog/view/javascript/common.js")
			.headers(headers_1),
            http("request_42")
			.get("/opencart/image/catalog/opencart-logo.png")
			.headers(headers_1),
            http("request_43")
			.get("/opencart/image/cache/catalog/demo/iphone_1-228x228.jpg")
			.headers(headers_43),
            http("request_44")
			.get("/opencart/catalog/view/javascript/font-awesome/fonts/fontawesome-webfont.woff2?v=4.7.0"),
            http("request_45")
			.get(uri1),
            http("request_46")
			.get(uri1),
            http("request_47")
			.get(uri1)))
		.pause(11)
		.exec(http("request_48")
			.post("/opencart/index.php?route=checkout/cart/add")
			.headers(headers_48)
			.formParam("product_id", "40")
			.formParam("quantity", "1")
			.resources(http("request_49")
			.get("/opencart/index.php?route=common/cart/info")
			.headers(headers_49),
            http("request_50")
			.get("/opencart/image/cache/catalog/demo/iphone_1-47x47.jpg")
			.headers(headers_43)))
		.pause(5)
		.exec(http("request_51")
			.get("/opencart/index.php?route=checkout/cart")
			.headers(headers_34)
			.resources(http("request_52")
			.get("/opencart/catalog/view/javascript/font-awesome/fonts/fontawesome-webfont.woff2?v=4.7.0"),
            http("request_53")
			.get(uri1),
            http("request_54")
			.get(uri1),
            http("request_55")
			.get(uri1),
            http("request_56")
			.get("/opencart/index.php?route=extension/total/shipping/country&country_id=222")
			.headers(headers_56)))

	setUp(scn.inject(atOnceUsers(5))).protocols(httpProtocol)
}