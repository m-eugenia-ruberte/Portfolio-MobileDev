//Define una clase
class SmartDevice {
    // empty body
}

fun main() {
}

//Crea una instancia de una clase
class SmartDevice {
    // empty body
}

fun main() {
    val smartTvDevice = SmartDevice()
}

//Define métodos de clase
class SmartDevice {
    fun turnOn(){
        println("Smart device is turned on.")
    }
    fun turnOff(){
        println("Smart device is turned off.")
    }
}

fun main() {
    val smartTvDevice = SmartDevice()
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
}

//Define las propiedades de una clase
class SmartDevice {

    val name = "Android TV"
    val category = "Entertainment"
    var deviceStatus = "online"

    fun turnOn(){
        println("Smart device is turned on.")
    }
    fun turnOff(){
        println("Smart device is turned off.")
    }
}

fun main() {
    val smartTvDevice = SmartDevice()
    println("Device name is: ${smartTvDevice.name}")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
}

//Funciones get y set en propiedades
class SmartDevice {

    val name = "Android TV"
    val category = "Entertainment"
    var deviceStatus = "online"
    var speakerVolume = 2
        get() = field
        set(value) {
            //Para asegurarse que el volumen esté entre 0 y 100
            if (value in 0..100) {
                field = value
            }
        }

    fun turnOn(){
        println("Smart device is turned on.")
    }
    fun turnOff(){
        println("Smart device is turned off.")
    }
}

fun main() {
    val smartTvDevice = SmartDevice()
    println("Device name is: ${smartTvDevice.name}")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
}

//Define un constructor
//Constructor predeterminado
class SmartDevice constructor() {
    ...
}
class SmartDevice {
    ...
}

//Define un constructor parametrizado
class SmartDevice(val name: String, val category: String) {

    var deviceStatus = "online"

    constructor(name: String, category: String, statusCode: Int):this(name,category){
        deviceStatus = when(statusCode){
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }
}

fun main() {
    val smartTvDevice = SmartDevice("Android TV", "Entertainment")
    val tablet = SmartDevice(name = "Tablet", category = "Work", 0)
    println("Device name is: ${smartTvDevice.name}")
    println(smartTvDevice.deviceStatus)
    println(smartTvDevice1.deviceStatus)
}

//Implementa una relación entre clases
open class SmartDevice(val name: String) {

    fun turnOn(){
        println("Smart device is turned on.")
    }
    fun turnOff(){
        println("Smart device is turned off.")
    }
}

class SmartTvDevice(deviceName:String, deviceCategory:String):
    SmartDevice(name= deviceName, category = deviceCategory){
    var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }
    var channelNumber = 1
        set(value){
            if(value in 0..200){
                field = value
            }
        }

    fun increaseSpeakerVolume(){
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    fun nextChannel(){
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }
}

class SmartLightDevice(deviceName: String, deviceCategory: String):
    SmartDevice(name = deviceName, category = deviceCategory){

    var brigntnessLevel = 0
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    fun increaseBrightness(){
        brightnessLevel++
        println("Brightness number increased to $brightnessLevel.")
    }
}

//Relaciones entre clases
class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice){

    fun turnOnTv(){
        smartTvDevice.turnOn()
    }

    fun turnOffTv(){
        smartTvDevice.turnOff()
    }

    fun increaseTvVolume(){
        smartTvDevice.increaseSpeakerVolume()
    }

    fun changeTvChannelToNext(){
        smartTvDevice.nextChannel()
    }

    fun turnOnLight(){
        smartLightDevice.turnOn()
    }

    fun turnOffLight(){
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness(){
        smartLightDevice.increaseBrightness()
    }

    fun turnOffAllDevices(){
        turnOffTv()
        turnOnLight()
    }
}

//Anula métodos de superclase de subclases
open class SmartDevice(val name: String, val category: String) {

    var deviceStatus: String = ""

    open fun turnOn(){
        println("Smart device is turned on.")
    }
    open fun turnOff(){
        println("Smart device is turned off.")
    }
}

class SmartTvDevice(deviceName:String, deviceCategory:String):
    SmartDevice(name= deviceName, category = deviceCategory){

    var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }
    var channelNumber = 1
        set(value){
            if(value in 0..200){
                field = value
            }
        }

    fun increaseSpeakerVolume(){
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    fun nextChannel(){
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }

    override fun turnOn(){
        deviceStatus = "on"
        println("$name is turned on. Speaker volume is set to " +
                "$speakerVolume and channel number is " +
                "set to $channelNumber.")
    }

    override fun turnOff(){
        deviceStatus = "off"
        println("$name turned off")
    }
}

class SmartLightDevice(deviceName: String, deviceCategory: String):
    SmartDevice(name = deviceName, category = deviceCategory){

    var brightnessLevel = 0
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    fun increaseBrightness(){
        brightnessLevel++
        println("Brightness number increased to $brightnessLevel.")
    }

    override fun turnOn(){
        deviceStatus = "on"
        brightnessLevel = 2
        println("$name turned on. The brightness level is $brightnessLevel.")
    }

    override fun turnOff(){
        deviceStatus = "off"
        brightnessLevel = 0
        println("$name turned off")
    }
}

class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice){

    fun turnOnTv(){
        smartTvDevice.turnOn()
    }

    fun turnOffTv(){
        smartTvDevice.turnOff()
    }

    fun increaseTvVolume(){
        smartTvDevice.increaseSpeakerVolume()
    }

    fun changeTvChannelToNext(){
        smartTvDevice.nextChannel()
    }

    fun turnOnLight(){
        smartLightDevice.turnOn()
    }

    fun turnOffLight(){
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness(){
        smartLightDevice.increaseBrightness()
    }

    fun turnOffAllDevices(){
        turnOffTv()
        turnOnLight()
    }
}

fun main() {
    var smartDevice:SmartDevice = SmartTvDevice("Android TV", "Entertainment")
    smartDevice.turnOn()

    smartDevice = SmartLightDevice("Google Light", "Utility")
    smartDevice.turnOn()
}

//Vuelve a usar el código de superclase en subclases con la palabra clave super.
open class SmartDevice(val name: String, val category: String) {

    var deviceStatus: String = ""

    open fun turnOn(){
        deviceStatus = "on"
    }
    open fun turnOff(){
        deviceStatus = "off"
    }
}

class SmartTvDevice(deviceName:String, deviceCategory:String):
    SmartDevice(name= deviceName, category = deviceCategory){

    var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }
    var channelNumber = 1
        set(value){
            if(value in 0..200){
                field = value
            }
        }

    fun increaseSpeakerVolume(){
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    fun nextChannel(){
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }

    override fun turnOn(){
        super.turnOn()
        println("$name is turned on. Speaker volume is set to " +
                "$speakerVolume and channel number is " +
                "set to $channelNumber.")
    }

    override fun turnOff(){
        super.turnOff()
        println("$name turned off")
    }
}

class SmartLightDevice(deviceName: String, deviceCategory: String):
    SmartDevice(name = deviceName, category = deviceCategory){

    var brightnessLevel = 0
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    fun increaseBrightness(){
        brightnessLevel++
        println("Brightness number increased to $brightnessLevel.")
    }

    override fun turnOn(){
        super.turnOn()
        brightnessLevel = 2
        println("$name turned on. The brightness level is $brightnessLevel.")
    }

    override fun turnOff(){
        super.turnOff()
        brightnessLevel = 0
        println("$name turned off")
    }
}

class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice){

    fun turnOnTv(){
        smartTvDevice.turnOn()
    }

    fun turnOffTv(){
        smartTvDevice.turnOff()
    }

    fun increaseTvVolume(){
        smartTvDevice.increaseSpeakerVolume()
    }

    fun changeTvChannelToNext(){
        smartTvDevice.nextChannel()
    }

    fun turnOnLight(){
        smartLightDevice.turnOn()
    }

    fun turnOffLight(){
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness(){
        smartLightDevice.increaseBrightness()
    }

    fun turnOffAllDevices(){
        turnOffTv()
        turnOnLight()
    }
}

fun main() {
    var smartDevice:SmartDevice = SmartTvDevice("Android TV", "Entertainment")
    smartDevice.turnOn()

    smartDevice = SmartLightDevice("Google Light", "Utility")
    smartDevice.turnOn()
}

//Anula propiedades de superclase de subclases
open class SmartDevice(val name: String, val category: String) {

    var deviceStatus = "online"

    open val deviceType = "Unknown"

    open fun turnOn(){
        deviceStatus = "on"
    }
    open fun turnOff(){
        deviceStatus = "off"
    }
}

class SmartTvDevice(deviceName:String, deviceCategory:String):
    SmartDevice(name= deviceName, category = deviceCategory){

    override val deviceType = "Smart TV"

    var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }
    var channelNumber = 1
        set(value){
            if(value in 0..200){
                field = value
            }
        }

    fun increaseSpeakerVolume(){
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    fun nextChannel(){
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }

    override fun turnOn(){
        super.turnOn()
        println("$name is turned on. Speaker volume is set to " +
                "$speakerVolume and channel number is " +
                "set to $channelNumber.")
    }

    override fun turnOff(){
        super.turnOff()
        println("$name turned off")
    }
}

class SmartLightDevice(deviceName: String, deviceCategory: String):
    SmartDevice(name = deviceName, category = deviceCategory){

    override val deviceType = "Smart Light"

    var brightnessLevel = 0
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    fun increaseBrightness(){
        brightnessLevel++
        println("Brightness number increased to $brightnessLevel.")
    }

    override fun turnOn(){
        super.turnOn()
        brightnessLevel = 2
        println("$name turned on. The brightness level is $brightnessLevel.")
    }

    override fun turnOff(){
        super.turnOff()
        brightnessLevel = 0
        println("$name turned off")
    }
}

class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice){

    fun turnOnTv(){
        smartTvDevice.turnOn()
    }

    fun turnOffTv(){
        smartTvDevice.turnOff()
    }

    fun increaseTvVolume(){
        smartTvDevice.increaseSpeakerVolume()
    }

    fun changeTvChannelToNext(){
        smartTvDevice.nextChannel()
    }

    fun turnOnLight(){
        smartLightDevice.turnOn()
    }

    fun turnOffLight(){
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness(){
        smartLightDevice.increaseBrightness()
    }

    fun turnOffAllDevices(){
        turnOffTv()
        turnOnLight()
    }
}

fun main() {
    var smartDevice:SmartDevice = SmartTvDevice("Android TV", "Entertainment")
    smartDevice.turnOn()

    smartDevice = SmartLightDevice("Google Light", "Utility")
    smartDevice.turnOn()
}

//Modificadores de visibilidad
//Especifica un modificador de visibilidad para propiedades
open class SmartDevice(val name: String, val category: String) {

    var deviceStatus = "online"
        protected set

    open val deviceType = "Unknown"

    open fun turnOn(){
        deviceStatus = "on"
    }
    open fun turnOff(){
        deviceStatus = "off"
    }
}

class SmartTvDevice(deviceName:String, deviceCategory:String):
    SmartDevice(name= deviceName, category = deviceCategory){

    override val deviceType = "Smart TV"

    var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }
    var channelNumber = 1
        set(value){
            if(value in 0..200){
                field = value
            }
        }

    fun increaseSpeakerVolume(){
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    fun nextChannel(){
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }

    override fun turnOn(){
        super.turnOn()
        println("$name is turned on. Speaker volume is set to " +
                "$speakerVolume and channel number is " +
                "set to $channelNumber.")
    }

    override fun turnOff(){
        super.turnOff()
        println("$name turned off")
    }
}

class SmartLightDevice(deviceName: String, deviceCategory: String):
    SmartDevice(name = deviceName, category = deviceCategory){

    override val deviceType = "Smart Light"

    var brightnessLevel = 0
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    fun increaseBrightness(){
        brightnessLevel++
        println("Brightness number increased to $brightnessLevel.")
    }

    override fun turnOn(){
        super.turnOn()
        brightnessLevel = 2
        println("$name turned on. The brightness level is $brightnessLevel.")
    }

    override fun turnOff(){
        super.turnOff()
        brightnessLevel = 0
        println("$name turned off")
    }
}

class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice){

    var deviceTurnOnCount = 0
        private set

    fun turnOnTv(){
        deviceTurnOnCount++
        smartTvDevice.turnOn()
    }

    fun turnOffTv(){
        deviceTurnOnCount--
        smartTvDevice.turnOff()
    }

    fun increaseTvVolume(){
        smartTvDevice.increaseSpeakerVolume()
    }

    fun changeTvChannelToNext(){
        smartTvDevice.nextChannel()
    }

    fun turnOnLight(){
        deviceTurnOnCount++
        smartLightDevice.turnOn()
    }

    fun turnOffLight(){
        deviceTurnOnCount--
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness(){
        smartLightDevice.increaseBrightness()
    }

    fun turnOffAllDevices(){
        turnOffTv()
        turnOnLight()
    }
}

fun main() {
    var smartDevice:SmartDevice = SmartTvDevice("Android TV", "Entertainment")
    smartDevice.turnOn()

    smartDevice = SmartLightDevice("Google Light", "Utility")
    smartDevice.turnOn()
}

//Modificadores de visibilidad para métodos
protected fun nextChannel(){
    channelNumber++
    println("Channel number increased to $channelNumber.")
}

//Modificadores de visibilidad para constructores
open class SmartDevice protected constructor (val name: String, val category: String) {

    var deviceStatus = "online"
        protected set

    open val deviceType = "Unknown"

    open fun turnOn(){
        deviceStatus = "on"
    }
    open fun turnOff(){
        deviceStatus = "off"
    }
}

//Modificadores de visibilidad para clases
internal open class SmartDevice protected constructor (val name: String, val category: String) {

    var deviceStatus = "online"
        protected set

    open val deviceType = "Unknown"

    open fun turnOn(){
        deviceStatus = "on"
    }
    open fun turnOff(){
        deviceStatus = "off"
    }
}

//Especifica los modificadores de visibilidad adecuados
internal open class SmartDevice protected constructor (val name: String, val category: String) {

    var deviceStatus = "online"
        protected set

    open val deviceType = "Unknown"

    open fun turnOn(){
        deviceStatus = "on"
    }
    open fun turnOff(){
        deviceStatus = "off"
    }
}

class SmartTvDevice(deviceName:String, deviceCategory:String):
    SmartDevice(name= deviceName, category = deviceCategory){

    override val deviceType = "Smart TV"

    private var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }
    private var channelNumber = 1
        set(value){
            if(value in 0..200){
                field = value
            }
        }

    fun increaseSpeakerVolume(){
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    protected fun nextChannel(){
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }

    override fun turnOn(){
        super.turnOn()
        println("$name is turned on. Speaker volume is set to " +
                "$speakerVolume and channel number is " +
                "set to $channelNumber.")
    }

    override fun turnOff(){
        super.turnOff()
        println("$name turned off")
    }
}

class SmartLightDevice(deviceName: String, deviceCategory: String):
    SmartDevice(name = deviceName, category = deviceCategory){

    override val deviceType = "Smart Light"

    private var brightnessLevel = 0
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    fun increaseBrightness(){
        brightnessLevel++
        println("Brightness number increased to $brightnessLevel.")
    }

    override fun turnOn(){
        super.turnOn()
        brightnessLevel = 2
        println("$name turned on. The brightness level is $brightnessLevel.")
    }

    override fun turnOff(){
        super.turnOff()
        brightnessLevel = 0
        println("$name turned off")
    }
}

class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice){

    var deviceTurnOnCount = 0
        private set

    fun turnOnTv(){
        deviceTurnOnCount++
        smartTvDevice.turnOn()
    }

    fun turnOffTv(){
        deviceTurnOnCount--
        smartTvDevice.turnOff()
    }

    fun increaseTvVolume(){
        smartTvDevice.increaseSpeakerVolume()
    }

    fun changeTvChannelToNext(){
        smartTvDevice.nextChannel()
    }

    fun turnOnLight(){
        deviceTurnOnCount++
        smartLightDevice.turnOn()
    }

    fun turnOffLight(){
        deviceTurnOnCount--
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness(){
        smartLightDevice.increaseBrightness()
    }

    fun turnOffAllDevices(){
        turnOffTv()
        turnOnLight()
    }
}

fun main() {
    var smartDevice:SmartDevice = SmartTvDevice("Android TV", "Entertainment")
    smartDevice.turnOn()

    smartDevice = SmartLightDevice("Google Light", "Utility")
    smartDevice.turnOn()
}

//Define delegados de propiedad
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

open class SmartDevice (val name: String, val category: String) {

    var deviceStatus = "online"
        protected set

    open val deviceType = "Unknown"

    open fun turnOn(){
        deviceStatus = "on"
    }
    open fun turnOff(){
        deviceStatus = "off"
    }
}

class SmartTvDevice(deviceName:String, deviceCategory:String):
    SmartDevice(name= deviceName, category = deviceCategory){

    override val deviceType = "Smart TV"

    private var speakerVolume by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)

    private var channelNumber by RangeRegulator(initialValue = 1, minValue = 0, maxValue = 200)

    fun increaseSpeakerVolume(){
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    fun nextChannel(){
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }

    override fun turnOn(){
        super.turnOn()
        println("$name is turned on. Speaker volume is set to " +
                "$speakerVolume and channel number is " +
                "set to $channelNumber.")
    }

    override fun turnOff(){
        super.turnOff()
        println("$name turned off")
    }
}

class SmartLightDevice(deviceName: String, deviceCategory: String):
    SmartDevice(name = deviceName, category = deviceCategory){

    override val deviceType = "Smart Light"

    private var brightnessLevel by RangeRegulator(initialValue = 0, minValue = 0, maxValue = 100)

    fun increaseBrightness(){
        brightnessLevel++
        println("Brightness number increased to $brightnessLevel.")
    }

    override fun turnOn(){
        super.turnOn()
        brightnessLevel = 2
        println("$name turned on. The brightness level is $brightnessLevel.")
    }

    override fun turnOff(){
        super.turnOff()
        brightnessLevel = 0
        println("$name turned off")
    }
}

class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice){

    var deviceTurnOnCount = 0
        private set

    fun turnOnTv(){
        deviceTurnOnCount++
        smartTvDevice.turnOn()
    }

    fun turnOffTv(){
        deviceTurnOnCount--
        smartTvDevice.turnOff()
    }

    fun increaseTvVolume(){
        smartTvDevice.increaseSpeakerVolume()
    }

    fun changeTvChannelToNext(){
        smartTvDevice.nextChannel()
    }

    fun turnOnLight(){
        deviceTurnOnCount++
        smartLightDevice.turnOn()
    }

    fun turnOffLight(){
        deviceTurnOnCount--
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness(){
        smartLightDevice.increaseBrightness()
    }

    fun turnOffAllDevices(){
        turnOffTv()
        turnOnLight()
    }
}

class RangeRegulator(
    initialValue:Int,
    private val minValue: Int,
    private val maxValue: Int
): ReadWriteProperty<Any?, Int>{

    var fieldData = initialValue

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int{
        return fieldData
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int){
        if(value in minValue..maxValue){
            fieldData = value
        }
    }
}

fun main() {
    var smartDevice:SmartDevice = SmartTvDevice("Android TV", "Entertainment")
    smartDevice.turnOn()

    smartDevice = SmartLightDevice("Google Light", "Utility")
    smartDevice.turnOn()
}

//Prueba este desafío
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

open class SmartDevice (val name: String, val category: String) {

    var deviceStatus = "online"
        protected set

    open val deviceType = "Unknown"

    open fun turnOn(){
        deviceStatus = "on"
    }
    open fun turnOff(){
        deviceStatus = "off"
    }

    fun printDeviceInfo(){
        println("Device name: $name, category: $category, type: $deviceType")
    }
}

class SmartTvDevice(deviceName:String, deviceCategory:String):
    SmartDevice(name= deviceName, category = deviceCategory){

    override val deviceType = "Smart TV"

    private var speakerVolume by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)

    private var channelNumber by RangeRegulator(initialValue = 1, minValue = 0, maxValue = 200)

    fun increaseSpeakerVolume(){
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    fun decreaseSpeakerVolume(){
        speakerVolume--
        println("Speaker volume decreased to $speakerVolume.")
    }

    fun nextChannel(){
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }

    fun previousChannel(){
        channelNumber--
        println("Channel number decreased to $channelNumber.")
    }

    override fun turnOn(){
        super.turnOn()
        println("$name is turned on. Speaker volume is set to " +
                "$speakerVolume and channel number is " +
                "set to $channelNumber.")
    }

    override fun turnOff(){
        super.turnOff()
        println("$name turned off")
    }
}

class SmartLightDevice(deviceName: String, deviceCategory: String):
    SmartDevice(name = deviceName, category = deviceCategory){

    override val deviceType = "Smart Light"

    private var brightnessLevel by RangeRegulator(initialValue = 0, minValue = 0, maxValue = 100)

    fun increaseBrightness(){
        brightnessLevel++
        println("Brightness number increased to $brightnessLevel.")
    }

    fun decreaseBrightness(){
        brightnessLevel--
        println("Brightness number decreased to $brightnessLevel.")
    }

    override fun turnOn(){
        super.turnOn()
        brightnessLevel = 2
        println("$name turned on. The brightness level is $brightnessLevel.")
    }

    override fun turnOff(){
        super.turnOff()
        brightnessLevel = 0
        println("$name turned off")
    }
}

class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice){

    var deviceTurnOnCount = 0
        private set

    fun turnOnTv(){
        deviceTurnOnCount++
        smartTvDevice.turnOn()
    }

    fun turnOffTv(){
        deviceTurnOnCount--
        smartTvDevice.turnOff()
    }

    fun increaseTvVolume(){
        if(smartTvDevice.deviceStatus == "on"){
            smartTvDevice.increaseSpeakerVolume()
        }
    }

    fun decreaseTvVolume(){
        if(smartTvDevice.deviceStatus == "on"){
            smartTvDevice.decreaseSpeakerVolume()
        }
    }

    fun changeTvChannelToNext(){
        if(smartTvDevice.deviceStatus == "on"){
            smartTvDevice.nextChannel()
        }
    }

    fun changeTvChannelToPrevious(){
        if(smartTvDevice.deviceStatus == "on"){
            smartTvDevice.previousChannel()
        }
    }

    fun printSmartTvInfo(){
        smartTvDevice.printDeviceInfo()
    }

    fun turnOnLight(){
        deviceTurnOnCount++
        smartLightDevice.turnOn()
    }

    fun turnOffLight(){
        deviceTurnOnCount--
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness(){
        if(smartLightDevice.deviceStatus == "on"){
            smartLightDevice.increaseBrightness()
        }
    }
    fun decreaseLightBrightness(){
        if(smartLightDevice.deviceStatus == "on"){
            smartLightDevice.decreaseBrightness()
        }
    }

    fun printSmartLightInfo(){
        smartLightDevice.printDeviceInfo()
    }

    fun turnOffAllDevices(){
        turnOffTv()
        turnOnLight()
    }
}

class RangeRegulator(
    initialValue:Int,
    private val minValue: Int,
    private val maxValue: Int
): ReadWriteProperty<Any?, Int>{

    var fieldData = initialValue

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int{
        return fieldData
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int){
        if(value in minValue..maxValue){
            fieldData = value
        }
    }
}

fun main() {

    val smartHome = SmartHome(
        SmartTvDevice("Android TV", "Entertainment"),
        SmartLightDevice("Google Light", "Utility"))

    smartHome.changeTvChannelToPrevious()
    smartHome.turnOnTv()
    smartHome.changeTvChannelToPrevious()
    smartHome.turnOnLight()
    smartHome.printSmartTvInfo()
    smartHome.printSmartLightInfo()
    println(smartHome.deviceTurnOnCount)

}
