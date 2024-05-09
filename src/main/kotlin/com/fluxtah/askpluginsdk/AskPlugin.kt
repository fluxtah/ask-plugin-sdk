package com.fluxtah.askpluginsdk

import com.fluxtah.askpluginsdk.logging.AskLogger

class CreateAssistantDefinitionsConfig(val logger: AskLogger)

interface AskPlugin {
    fun createAssistantDefinitions(config: CreateAssistantDefinitionsConfig): List<AssistantDefinition>
}