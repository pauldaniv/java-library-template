group = "com.pauldaniv.two"
version = "1.0-SNAPSHOT"

dependencies {
  implementation(project(":first"))
  testImplementation("org.junit.jupiter:junit-jupiter")
  testImplementation("org.assertj:assertj-core")
}
