# Minecraft Plugin: WolfZeus

WolfZeus is a Paper Minecraft plugin for Java 21 that listens for entity damage and checks whether the attacker is a wolf named exactly `Zeus`, ignoring text formatting. When that wolf hits a living entity, the plugin removes the target’s helmet, chestplate, leggings, and boots, then increases the hit damage.

## Install

1. Build the plugin with Gradle by running `./gradlew build` from the project directory.
2. Copy the generated JAR from `build/libs` into your Paper server’s `plugins` folder.
3. Start or restart the server.

## Use

1. Use a name tag to name a wolf `Zeus`.
2. Have the wolf attack a living entity.
3. On a successful, uncancelled hit, the plugin removes the target’s four armor pieces and increases the damage dealt by that hit.

---

More Minecraft mod projects by EnderDevelopment: https://github.com/EnderDevelopment

Project page: https://dash.enderdevelopment.com/community/6a351a60-c88a-48b1-859c-3730d53da23d?utm_source=github&utm_medium=readme&utm_campaign=auto_publish&utm_content=6a351a60-c88a-48b1-859c-3730d53da23d
