plugins {
    id("cc-tweaked.kotlin-convention")
    id("cc-tweaked.java-convention")
}

repositories {
    maven("https://maven.minecraftforge.net") {
        content {
            includeGroup("net.minecraftforge")
            includeGroup("cpw.mods")
        }
    }
}

dependencies {
    implementation(libs.kotlin.stdlib)
    implementation(libs.errorProne.api)
    implementation(libs.nullAway)
}

tasks.test {
    jvmArgs(
        "--add-exports=jdk.compiler/com.sun.tools.javac.api=ALL-UNNAMED",
        "--add-exports=jdk.compiler/com.sun.tools.javac.file=ALL-UNNAMED",
        "--add-exports=jdk.compiler/com.sun.tools.javac.main=ALL-UNNAMED",
        "--add-exports=jdk.compiler/com.sun.tools.javac.model=ALL-UNNAMED",
        "--add-exports=jdk.compiler/com.sun.tools.javac.parser=ALL-UNNAMED",
        "--add-exports=jdk.compiler/com.sun.tools.javac.processing=ALL-UNNAMED",
        "--add-exports=jdk.compiler/com.sun.tools.javac.tree=ALL-UNNAMED",
        "--add-exports=jdk.compiler/com.sun.tools.javac.util=ALL-UNNAMED",
        "--add-opens=jdk.compiler/com.sun.tools.javac.code=ALL-UNNAMED",
        "--add-opens=jdk.compiler/com.sun.tools.javac.comp=ALL-UNNAMED",
    )
}