package example

trait HelloBase {
  def hello(name: String) = {
    s"Hello, ${name}!"
  }
}

class Hello extends HelloBase