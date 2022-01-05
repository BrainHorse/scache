import sbt._

object Dependencies {

  val scalatest        = "org.scalatest"       %% "scalatest"      % "3.2.3"
  // TODO replace with real version after migration https://github.com/evolution-gaming/cats-helper/pull/103
  val `cats-helper`    = "com.evolutiongaming" %% "cats-helper"    % "2.6.1-SNAPSHOT"
  // TODO replace with real version after migration https://github.com/evolution-gaming/cats-helper/pull/103
  val smetrics         = "com.evolutiongaming" %% "smetrics"       % "0.3.3-SNAPSHOT"
  val `kind-projector` = "org.typelevel"        % "kind-projector" % "0.11.0"

  object Cats {
    val core   = "org.typelevel" %% "cats-core"   % "2.6.1"
    val effect = "org.typelevel" %% "cats-effect" % "3.3.0"
  }
}
