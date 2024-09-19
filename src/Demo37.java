void main(){
    Object myObj = new Object();

    // Java
    if (myObj == null){}    // ✅
    if (null == myObj) {}   // ✅
 //   if (myObj = null) {}    // ❌ You can't do this in Java, Java compiler detect such codes
//    if (null = myObj) {}    // ❌

    // C, C++, etc.
    if (myObj == null){}    // ✅
    if (null == myObj) {}   // ✅
 //   if (myObj = null) {}    // ✅ In C, this will compile okay
 //   if (null = myObj) {}    // ❌
}