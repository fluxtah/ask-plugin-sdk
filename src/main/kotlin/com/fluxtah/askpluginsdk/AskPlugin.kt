package com.fluxtah.askpluginsdk

interface AskPlugin {
    fun createAssistantDefinitions(): List<AssistantDefinition>
}