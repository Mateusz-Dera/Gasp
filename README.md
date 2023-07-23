# Gasp
## Godot Android SharedPreferences
A library that allows loading saved SharedPreferences into Godot Engine 4.1.
Useful for porting projects from other engines such as LibGDX.

# Info
[![Version](https://img.shields.io/badge/1.0-Plugin_version-orange.svg)](https://github.com/Mateusz-Dera/Anim-360)
[![Version](https://img.shields.io/badge/4.1-Godot_version-blue.svg)](https://github.com/Mateusz-Dera/Anim-360)
[![Version](https://img.shields.io/badge/24-Min_SDK-green.svg)](https://github.com/Mateusz-Dera/Anim-360)
[![Version](https://img.shields.io/badge/33-Target_SDK-green.svg)](https://github.com/Mateusz-Dera/Anim-360)
[![Version](https://img.shields.io/badge/33-Compile_SDK-green.svg)](https://github.com/Mateusz-Dera/Anim-360)

# Instalation:
TODO

# Loading SharedPreferences
|GDScript code|
|:---|
|```sharedPreferencesName("<name>")```|

# Supported variable types:
|Type|GDScript code|
|:---|:---|
|String|```getString("<name>")```|
|Integer|```getInt("<name>")```|
|Float|```getFloat("<name>")```|
|Boolean|```getBoolean("<name>")```|

# Example of use:
GDScript
```python
func _ready():
	var singleton = Engine.get_singleton("Gasp")
	singleton.sharedPreferencesName("old_game_version_save")
	print("Best score:")
	print(singleton.getInt("best"))
	pass
```
