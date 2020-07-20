plugins {
    java
    idea
}

group = "com.pauldaniv.library.template"
version = "1.0-SNAPSHOT"

allprojects {
    apply(plugin = "java")

    repositories {
        mavenCentral()
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/pauldaniv/bom")
            credentials {
                username = project.findProperty("gpr.usr") as String? ?: System.getenv("USERNAME")
                password = project.findProperty("gpr.key") as String? ?: System.getenv("TOKEN")
            }
        }
    }

    dependencies {
        implementation(platform("com.paul:bom:0.0.2"))
        implementation("org.codehaus.groovy:groovy")
        testImplementation("org.assertj:assertj-core")
    }
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

idea {
    module {
        excludeDirs.add(file(".idea"))
    }
}
