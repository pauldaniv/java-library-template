group = "com.pauldaniv.two"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
  jcenter()
}

dependencies {
  implementation(project(":first"))
  testImplementation("junit:junit")
  testImplementation("org.assertj:assertj-core")
}

configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_1_8
}

tasks.test {
  useJUnit()
  maxHeapSize = "1G"
}
