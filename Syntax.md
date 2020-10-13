## <a href='README.md#top'>回README</a>
## <a href='Basic.md#top'>回基本語法及環境建立</a>
# <span id='top'>Java基本語法學習</span>  
* ### <a href='#link1'>Java 物件導向</a>
* ### <a href='#link2'>例外處理</a>
* ### <a href='#link3'>泛型、列舉、標註</a>
* ### <a href='#link4'>Lambda</a>
<hr/>  

# <a href="https://openhome.cc/Gossip/Java/index.html" target="_blank">學習良葛格的教學網站</a>

## 產出Class檔
* javac HelloWorld.java

## run Class File
* java -classpath . HelloWorld
* java -cp . HelloWorld

## 編輯時指定Class Path(HelloWorld.java)
* javac -sourcepath . -d classes HelloWorld.java
* java -cp .;classes HelloWorld

## Package管理(src/fc/demo/BasicSyntax.java)
* javac -sourcepath src -cp classes -d classes src/fc/demo/BasicSyntax.java
* java -cp classes fc.demo.BasicSyntax

## 基礎語法
### 整數
* 可細分為short整數（佔2個位元組）、int整數（佔4個位元組）與long整數（佔8個位元組）。不同長度的整數，可儲存的整數範圍也不同。long整數佔的記憶體長度比int整數來得多，可表示的整數範圍也就比int整數大。同樣的，int整數可表示的整數範圍也比短整數來得大。

### 位元組
* byte型態顧名思義，長度就是一個位元組，在需要逐位元組處理資料時（例如影像處理、編碼處理等），就會使用byte型態，若用於表示整數，byte可表示-128到127的整數。

### 浮點數
* 主要用來儲存小數數值，可分為float浮點數（佔4個位元組）與double浮點數（佔8個位元組），double浮點數使用的記憶體空間比float浮點數來得多，可表示的精確度也比較大。

### 字元
* char型態用來儲存'A'、'B'、'林'等字元符號。在JDK8中，Java的字元採Unicode 6.2編碼，JVM實作採UTF-16 Big Endian，所以每個字元型態佔兩個位元組，中文字元與英文字元在Java中同樣都是用兩個位元組儲存。

### 有關編碼、Unicode、UTF 等，可以參考 哪來的純文字檔？，以及 Unicode 與 UTF。

### 布林
* boolean型態可表示true與false，分別代表邏輯的「真」與「假」。在Java中不用在意boolean型態的長度，因為你也無法將boolean型態與其它型態作運算。

<br/>

# <span id='link1'>Java 物件導向</span>

## 型態與基礎語法
* BasicSyntax.java : 型態、if、switch、for、while、continue、break
* util\Console.java
## 使用標準 API 類別
* Guess.java : java.util.Scanner練習
* DecimalDemo.java : java.math.BigDecimal練習
* DecimalDemo2.java : java.math.BigDecimal練習
## 陣列基礎
* Score.java : 一維陣列
* Score2.java : 一維陣列
* XY.java : 二維陣列
## 陣列複製
* CopyArray : Arrays.copyOf(跟深層複製效果一樣)
* ShallowCopy.java(淺層複製) : 只有指向物件中的陣列
* DeepCopy(深層複製) : 完整的複製方式
## 字串基礎
* Sum.java : 算數總和練習
* Average.java : 算數平均練習  

|方法|說明|  
|-|-|
|Byte.parseByte(number)|將number剖析為byte整數|  
|Short.parseShort(number)|將number為short整數|  
|Integer.parseInt(number)|將number為int整數|  
|Long.parseLong(number)|將number為long整數|  
|Float.parseFloat(number)|將number為float浮點數|  
|Double.parseDouble(number)|將number剖析為double浮點數|

## 字串特性
* OneTo100.java : StringBuilder練習
## 物件練習
* ClassExercise.java
* ClassExerciseStatic.java
* util\CashCard.java
## 重載
* Some.java
* util\SomeClass.java
## 不定長度引數
* MathTool.java
* util\MathToolClass.java
## 傳值呼叫
* CallByValue.java
## 繼承共同實作
* Game.java : 遊戲主體
* RPG\Magicina.java : 魔法師類別
* RPG\SwordsMan.java : 劍士類別
* RPG\Role.java : 角色類別  

|關鍵字|類別內部|相同套件類別|不同套件類別|
|-|-|-|-|
|public|可存取|可存取|可存取|
|protected|可存取|可存取|子類別可存取|
|無|可存取|可存取|不可存取|
|private|可存取|不可存取|不可存取|

## final練習
* util\Final.java(用BasicSyntax.java做練習)

## java.lang.Object
## 以下範例是在證明所有物件都繼承java.lang.Object
* util\ArrayList.java
* Guest.java

## 再看抽象類別
* util\GuessGame.java
* util\Console.java
* Guess2.java

## 介面定義行為 & 行為的多型 & 解決需求變化
* fly\Airplane.java
* fly\Flyer.java
* fly\FlyingFish.java
* fly\Helicopter.java
* fly\Seaplane.java
* swim\Anemonefish.java
* swim\Fish.java
* swim\Human.java
* swim\SwimPlayer.java
* swim\Piranha.java
* swim\Shark.java
* swim\Submarine.java
* swim\Swimmer.java
* Ocean.java

## 介面的預設
* RPG\Action.java
* RPG\Action2.java
* Game2.java

## 匿名內部類別
* connect\Client.java
* connect\ClientEvent.java
* connect\ClientListener.java
* connect\ClientQueue.java
* MultiChat.java

<a href='#top'>Top</a>  

# <span id='link2'>例外處理</span>

## 使用 try、catch & 例外繼承架構
* Average.java  

## 要抓還是要拋？
* util\FileUtil.java
* CallFile.java

## 認識堆疊追蹤
* StackTrace.java

## 關於 assert
* Game2.java

## 使用 finally
* util\FileUtil.java
* CallFile.java

## 自動嘗試關閉資源
* util\FileUtil2.java
* CallFile.java

## java.lang.AutoCloseable
* ResourceSome.java  

<a href='#top'>Top</a>  

# <span id='link3'>泛型、列舉、標註</span>

## 定義與使用泛型
* util\ArrayList.java
* Guest.java
* ReversedStringOrderClass.java

## 靜態方法上的泛型
* ReversedStringOrderClass.java

## 泛型的 extends & 泛型的 super
* Generic\Apple.java
* Generic\Banana.java
* Generic\Basket.java
* Generic\Fruit.java
* Generic\Node.java
* ContravarianceDemo.java
* ExtendsDemo.java

## 使用 enum 列舉常數
* enmu\Action.java
* Game3.java

## 進階 enum 運用
* enmu\Priority.java
* enmu\Priority2.java
* enmu\Action2.java
* enmu\Command.java
* Game4.java

## <span id='Annotation'>常用標準標註</span>
* <a href='Annotation.md#top'>Annotation</a>

## 自訂標註
* annotation\Email.java
* annotation\Ignore.java
* annotation\Test1.java
* annotation\Test2.java
* annotation\Test3.java
* annotation\Test4.java
* annotation\Test5.java
* annotation\Test6.java
* annotation\Test7.java
* annotation\Test8.java
* annotation\Test9.java
* annotation\Test10.java
* annotation\TestClass.java  

在定義標註時，可使用java.lang.annotation.Target限定標註使用位置，限定時可指定java.lang.annotation.ElementType的列舉值：  

package java.lang.annotation;
public enum ElementType {  
&nbsp;&nbsp;&nbsp;&nbsp;TYPE,                  // 用於類別、介面、列舉等  
&nbsp;&nbsp;&nbsp;&nbsp;FIELD,                 // 用於資料成員  
&nbsp;&nbsp;&nbsp;&nbsp;METHOD,                // 用於方法  
&nbsp;&nbsp;&nbsp;&nbsp;PARAMETER,             // 用於方法上的參數  
&nbsp;&nbsp;&nbsp;&nbsp;CONSTRUCTOR,           // 用於建構式  
&nbsp;&nbsp;&nbsp;&nbsp;LOCAL_VARIABLE,        // 用於區域變數  
&nbsp;&nbsp;&nbsp;&nbsp;ANNOTATION_TYPE,       // 用於標註型態  
&nbsp;&nbsp;&nbsp;&nbsp;PACKAGE,               // 適用套件  
&nbsp;&nbsp;&nbsp;&nbsp;TYPE_PARAMETER,        // 用於泛型宣告，JDK8新增  
&nbsp;&nbsp;&nbsp;&nbsp;TYPE_USE               // 用於各種型態，JDK8新增  
}  

<a href='https://checkerframework.org/jsr308/specification/java-annotation-design.html'>Annotation Explain</a>  

<a href='#top'>Top</a>  

# <span id='link4'>Lambda</span>
## 匿名類別與 Lambda
* Lambda.java

## Lambda 表示式與函式介面
* Lambda.java

## this 與 final
* Hello.java

## 方法與建構式參考
* ForEach.java

## 認識 Collection 架構 & 具有索引的 List
* Guest.java
* SimpleLinkedList

## 內容不重複的 Set
* WordCount.java
* Students.java

## 支援佇列操作的 Queue
* RequestQueue.java
* Stack.java

|Queue方法|Deque等義方法|
|-|-|
|add()|addLast()|
|offer()|offerLast()|
|remove()|removeFirst()|
|poll()|pollFirst()|
|element()|getFirst()|
|peek()|peekFirst()|

## Iterable 與 Iterator
* ForEach.java

## 介面預設方法
* ForEach.java

## 使用 Optional 取代 null
* NickName.java

## Consumer、Function、Predicate 與 Supplier
* <a href='https://openhome.cc/Gossip/Java/ConsumerFunctionPredicateSupplier.html' target='_blank'>連結</a>

## 使用 Stream 進行管線操作
* <a href='https://openhome.cc/Gossip/Java/Stream.html' target='_blank'>連結</a>

## Stream 的 reduce 與 collect
* <a href='https://openhome.cc/Gossip/Java/Reduction.html' target='_blank'>連結</a>

## Optional 與 Stream 的 flatMap
* <a href='https://openhome.cc/Gossip/Java/FlatMap.html' target='_blank'>連結</a>

## Stream 與平行化
* <a href='https://openhome.cc/Gossip/Java/ParallelStream.html' target='_blank'>連結</a>

<a href='#top'>Top</a>  

