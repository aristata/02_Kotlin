package polymorphism

import java.io.ByteArrayOutputStream
import java.io.OutputStream

open class Image {
  open fun save(output: OutputStream) {
    println("Some logic to save an image")
  }
}

interface VendorImage {
  fun save(output: OutputStream) {
    println("Vendor saving an image")
  }
}

/*
  super<PARENT> 를 통해 부모 구현체를 참조할 수 있다.
 */
class PNGImage : Image(), VendorImage {
  override fun save(output: OutputStream) {
    super<VendorImage>.save(output)
    super<Image>.save(output)
  }
}

fun main(args: Array<String>) {
  val pngImage = PNGImage()
  val os = ByteArrayOutputStream()
  pngImage.save(os)
}