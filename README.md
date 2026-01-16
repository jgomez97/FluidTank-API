# 🪣 FluidTank API

Public API for the **FluidTank** premium Spigot plugin.  
This API allows third-party plugins to safely interact with Fluid Tanks without accessing internal or NMS code.

✅ Spigot & Paper compatible  
✅ Minecraft **1.8.8 → 1.21.x**  
✅ Version-independent  
✅ Safe for premium distribution  
✅ Stable public contract

## 📑 Table of Contents

- [📦 Installation](#-installation)
  - [Maven](#maven)
  - [Gradle](#gradle)
- [🔌 plugin.yml](#-pluginyml)
- [🔗 Accessing the API](#-accessing-the-api)
- [📘 Basic Usage](#-basic-usage)
  - [Check if an ItemStack is a Fluid Tank](#check-if-an-itemstack-is-a-fluid-tank)
  - [Create a Fluid Tank](#create-a-fluid-tank)
  - [Read Tank Data](#read-tank-data)
  - [Update Tank Content](#update-tank-content)
- [🧪 Supported Fluids](#-supported-fluids)
- [🧩 Example Integration Plugin](#-example-integration-plugin)
- [🔐 Premium Policy](#-premium-policy)
- [🧾 License](#-license)
- [💬 Support & Links](#-support--links)

## 📦 Installation

### Maven

#### Add JitPack repository
```xml
<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>

<dependencies>
    <dependency>
	    <groupId>com.github.jgomez97</groupId>
	    <artifactId>FluidTank-API</artifactId>
	    <version>Tag</version>
	</dependency>
</dependencies>
```

### Gradle
```xml
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    compileOnly 'com.github.jgomez97:FluidTank-API:v2.5'
}
```
###⚠️ This API is provided at runtime by the FluidTank plugin.
The FluidTank plugin must be installed on the server.

## 🔌 plugin.yml
### Required dependency
```yml
depend: [FluidTank]
```

### Optional dependency
```yml
softdepend: [FluidTank]
```
## 🔗 Accessing the API
```java
RegisteredServiceProvider<FluidTankAPI> provider =
        Bukkit.getServicesManager().getRegistration(FluidTankAPI.class);

if (provider == null) {
    // FluidTank not installed
    return;
}

FluidTankAPI api = provider.getProvider();
```
## 📘 Basic Usage
### Check if an ItemStack is a Fluid Tank
```java
boolean isTank = api.isFluidTank(itemStack);
```
### Create a Fluid Tank
```java
ItemStack tank = api.getFluidTank(10); // Tank size
```
### Read Tank Data
```java
int level = api.getFluidTankLevel(tank);
int size = api.getFluidTankSize(tank);
FluidTankFluid fluid = api.getFluidTankFluid(tank);
```

### Update Tank Content
```java
ItemStack updatedTank = api.updateFluidTank(
        tank,
        FluidTankFluid.WATER,
        level + 1
);
```
## 🧪 Supported Fluids
```text
NONE
WATER
LAVA
MILK
BEETROOT
MUSHROOM
SUSPICIOUS
RABBIT
HONEY
DRAGON_BREATH
XP
```
## 🧩 Example Integration Plugin
```java
public class ExamplePlugin extends JavaPlugin {

    private FluidTankAPI api;

    @Override
    public void onEnable() {
        RegisteredServiceProvider<FluidTankAPI> provider =
                Bukkit.getServicesManager().getRegistration(FluidTankAPI.class);

        if (provider == null) {
            getLogger().warning("FluidTank not found!");
            return;
        }

        api = provider.getProvider();
        getLogger().info("FluidTank API hooked successfully.");
    }
}
```

## 🔐 Premium Policy
This API is intended only for integration with the FluidTank plugin.
	•	Redistribution of internal logic is not allowed
	•	Reverse engineering the plugin is prohibited
	•	API usage does not grant permission to repackage or clone features

## 🧾 License
© armandozetaxx | jgomez97
All rights reserved.

This API is provided for plugin integration purposes only.

## 💬 Support & Links
	•	🐞 Issues: GitHub Issues  
	•	💡 Suggestions: Discord https://discord.gg/UfY45TSmbJ  
	•	🧪 Plugin Page: SpigotMC https://www.spigotmc.org/resources/fluid-tank-1-8-8-1-21-11.93613/  
	•	📦 Builds: JitPack https://jitpack.io/#jgomez97/FluidTank-API/v2.5
  	•	📚 Documentation: https://armandozetaxx.gitbook.io/fluidtank  
  
Suggestions and contributions are always welcome ❤️

