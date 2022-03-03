package com.github.stianstr.phpstormmicropop.services

import com.intellij.openapi.project.Project
import com.github.stianstr.phpstormmicropop.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
