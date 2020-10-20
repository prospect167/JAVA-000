package com.prospect.java.exercises.jvm;

import java.util.stream.IntStream;

/**
 * @author prospect
 * @create 2020/10/18 9:23 下午
 */
public class Hello {

    public static void main(String[] args) {
        int a = 1, b = 2;
        int c = a + b;
        double d = 4;
        float f = 5;
        double e = d - f;
        int mut = a * b;
        int divide = c / a;
        System.out.println("c:" + c + " mut:" + mut + " divide:" + divide);
        int[] array = IntStream.rangeClosed(1, 10).toArray();
        for (int temp : array) {
            if (temp == 1) {
                System.out.println("I'm the number one");
            }
            System.out.println(temp);
        }
    }
}
/**
 Last modified 2020-10-20; size 1121 bytes
 MD5 checksum c8f08b219e946250884be5555144ea4a
 Compiled from "Hello.java"
 public class com.prospect.java.exercises.jvm.Hello
 minor version: 0
 major version: 52
 flags: ACC_PUBLIC, ACC_SUPER
 Constant pool:
 #1 = Methodref          #20.#32        // java/lang/Object."<init>":()V
 #2 = Double             4.0d
 #4 = Float              5.0f
 #5 = Fieldref           #33.#34        // java/lang/System.out:Ljava/io/PrintStream;
 #6 = Class              #35            // java/lang/StringBuilder
 #7 = Methodref          #6.#32         // java/lang/StringBuilder."<init>":()V
 #8 = String             #36            // c:
 #9 = Methodref          #6.#37         // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
 #10 = Methodref          #6.#38         // java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
 #11 = String             #39            //  mut:
 #12 = String             #40            //  divide:
 #13 = Methodref          #6.#41         // java/lang/StringBuilder.toString:()Ljava/lang/String;
 #14 = Methodref          #42.#43        // java/io/PrintStream.println:(Ljava/lang/String;)V
 #15 = InterfaceMethodref #44.#45        // java/util/stream/IntStream.rangeClosed:(II)Ljava/util/stream/IntStream;
 #16 = InterfaceMethodref #44.#46        // java/util/stream/IntStream.toArray:()[I
 #17 = String             #47            // I'm the number one
 #18 = Methodref          #42.#48        // java/io/PrintStream.println:(I)V
 #19 = Class              #49            // com/prospect/java/exercises/jvm/Hello
 #20 = Class              #50            // java/lang/Object
 #21 = Utf8               <init>
 #22 = Utf8               ()V
 #23 = Utf8               Code
 #24 = Utf8               LineNumberTable
 #25 = Utf8               main
 #26 = Utf8               ([Ljava/lang/String;)V
 #27 = Utf8               StackMapTable
 #28 = Class              #51            // "[Ljava/lang/String;"
 #29 = Class              #52            // "[I"
 #30 = Utf8               SourceFile
 #31 = Utf8               Hello.java
 #32 = NameAndType        #21:#22        // "<init>":()V
 #33 = Class              #53            // java/lang/System
 #34 = NameAndType        #54:#55        // out:Ljava/io/PrintStream;
 #35 = Utf8               java/lang/StringBuilder
 #36 = Utf8               c:
 #37 = NameAndType        #56:#57        // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
 #38 = NameAndType        #56:#58        // append:(I)Ljava/lang/StringBuilder;
 #39 = Utf8                mut:
 #40 = Utf8                divide:
 #41 = NameAndType        #59:#60        // toString:()Ljava/lang/String;
 #42 = Class              #61            // java/io/PrintStream
 #43 = NameAndType        #62:#63        // println:(Ljava/lang/String;)V
 #44 = Class              #64            // java/util/stream/IntStream
 #45 = NameAndType        #65:#66        // rangeClosed:(II)Ljava/util/stream/IntStream;
 #46 = NameAndType        #67:#68        // toArray:()[I
 #47 = Utf8               I'm the number one
 #48 = NameAndType        #62:#69        // println:(I)V
 #49 = Utf8               com/prospect/java/exercises/jvm/Hello
 #50 = Utf8               java/lang/Object
 #51 = Utf8               [Ljava/lang/String;
 #52 = Utf8               [I
 #53 = Utf8               java/lang/System
 #54 = Utf8               out
 #55 = Utf8               Ljava/io/PrintStream;
 #56 = Utf8               append
 #57 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
 #58 = Utf8               (I)Ljava/lang/StringBuilder;
 #59 = Utf8               toString
 #60 = Utf8               ()Ljava/lang/String;
 #61 = Utf8               java/io/PrintStream
 #62 = Utf8               println
 #63 = Utf8               (Ljava/lang/String;)V
 #64 = Utf8               java/util/stream/IntStream
 #65 = Utf8               rangeClosed
 #66 = Utf8               (II)Ljava/util/stream/IntStream;
 #67 = Utf8               toArray
 #68 = Utf8               ()[I
 #69 = Utf8               (I)V
 {
 public com.prospect.java.exercises.jvm.Hello();
 descriptor: ()V
 flags: ACC_PUBLIC
 Code:
 stack=1, locals=1, args_size=1
 0: aload_0
 1: invokespecial #1                  // Method java/lang/Object."<init>":()V
 4: return
 LineNumberTable:
 line 9: 0

 public static void main(java.lang.String[]);
 descriptor: ([Ljava/lang/String;)V
 flags: ACC_PUBLIC, ACC_STATIC
 Code:
 stack=4, locals=16, args_size=1
 0: iconst_1
 1: istore_1
 2: iconst_2
 3: istore_2
 4: iload_1
 5: iload_2
 6: iadd
 7: istore_3
 8: ldc2_w        #2                  // double 4.0d
 11: dstore        4
 13: ldc           #4                  // float 5.0f
 15: fstore        6
 17: dload         4
 19: fload         6
 21: f2d
 22: dsub
 23: dstore        7
 25: iload_1
 26: iload_2
 27: imul
 28: istore        9
 30: iload_3
 31: iload_1
 32: idiv
 33: istore        10
 35: getstatic     #5                  // Field java/lang/System.out:Ljava/io/PrintStream;
 38: new           #6                  // class java/lang/StringBuilder
 41: dup
 42: invokespecial #7                  // Method java/lang/StringBuilder."<init>":()V
 45: ldc           #8                  // String c:
 47: invokevirtual #9                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
 50: iload_3
 51: invokevirtual #10                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
 54: ldc           #11                 // String  mut:
 56: invokevirtual #9                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
 59: iload         9
 61: invokevirtual #10                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
 64: ldc           #12                 // String  divide:
 66: invokevirtual #9                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
 69: iload         10
 71: invokevirtual #10                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
 74: invokevirtual #13                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
 77: invokevirtual #14                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
 80: iconst_1
 81: bipush        10
 83: invokestatic  #15                 // InterfaceMethod java/util/stream/IntStream.rangeClosed:(II)Ljava/util/stream/IntStream;
 86: invokeinterface #16,  1           // InterfaceMethod java/util/stream/IntStream.toArray:()[I
 91: astore        11
 93: aload         11
 95: astore        12
 97: aload         12
 99: arraylength
 100: istore        13
 102: iconst_0
 103: istore        14
 105: iload         14
 107: iload         13
 109: if_icmpge     147
 112: aload         12
 114: iload         14
 116: iaload
 117: istore        15
 119: iload         15
 121: iconst_1
 122: if_icmpne     133
 125: getstatic     #5                  // Field java/lang/System.out:Ljava/io/PrintStream;
 128: ldc           #17                 // String I'm the number one
 130: invokevirtual #14                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
 133: getstatic     #5                  // Field java/lang/System.out:Ljava/io/PrintStream;
 136: iload         15
 138: invokevirtual #18                 // Method java/io/PrintStream.println:(I)V
 141: iinc          14, 1
 144: goto          105
 147: return
 LineNumberTable:
 line 12: 0
 line 13: 4
 line 14: 8
 line 15: 13
 line 16: 17
 line 17: 25
 line 18: 30
 line 19: 35
 line 20: 80
 line 21: 93
 line 22: 119
 line 23: 125
 line 25: 133
 line 21: 141
 line 27: 147
 StackMapTable: number_of_entries = 3
 frame_type = 255 // full_frame
    offset_delta = 105
    locals = [ class "[Ljava/lang/String;", int, int, int, double, float, double, int, int, class "[I", class "[I", int, int ]
    stack = []
    frame_type = 252 // append
    offset_delta = 27
    locals = [ int ]
    frame_type = 255 // full_frame
    offset_delta = 13
    locals = [ class "[Ljava/lang/String;", int, int, int, double, float, double, int, int, class "[I" ]
    stack = []
    }
**/