plugins {
  id("java-library")
  id("kotlin")
  id("com.android.lint")
}

lintOptions {
  htmlReport = true
  htmlOutput = file("lint-report.html")
  textReport = true
  isAbsolutePaths = false
  isIgnoreTestSources = true
}

java {
  sourceCompatibility = JavaVersion.VERSION_1_8
  targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
  compileOnly(Dependencies.lintApi)
  compileOnly(Dependencies.lintChecks)
  compileOnly(Dependencies.kotlin)
  testImplementation(Dependencies.junit)
  testImplementation(Dependencies.lint)
  testImplementation(Dependencies.lintTests)
  testImplementation(Dependencies.testUtils)
}
project.apply {
  from("$rootDir/gradle/ktlint.gradle")
  from("$rootDir/gradle/dependency-updates.gradle")
}