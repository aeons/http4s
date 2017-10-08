package org.http4s.server.staticcontent

import org.http4s.Http4sSpec

class SanitizeSpec extends Http4sSpec {

  "staticcontent.sanitize" should {
    "replace .. with . in paths" in {
      val path = "../../bin/sh"

      sanitize(path) must_=== "././bin/sh"
    }

    "replace ... with . in paths" in {
      val path = "../.../bin/sh"

      sanitize(path) must_=== "././bin/sh"
    }
  }

}
