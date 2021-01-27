import SwiftUI
import shared


struct ContentView: View {
    
    let greeter = koin.get(clazz: Greeter.self) as! Greeter
    
    var body: some View {
        Text(greeter.greet())
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
