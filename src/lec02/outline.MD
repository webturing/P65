# 第二讲：24点计算引擎之后缀式产生和计算模块
## 高精度计算
- `java.math.BigInteger` 高精度大数

  ```java
  BigInteger a=new BigInteger("1111111111111111111111111111111");
  BigInteger b=new BigInteger("1111111111111111111111111111111");
  System.out.println(a.add(b));
  System.out.println(a.subtract(b));
  System.out.println(a.multiply(b));
  System.out.println(a.pow(5));
  System.out.println(a.isProbablePrime(10));
  ```

  

-  `java.math.BigDecimal`多用于金融计算

- 阶乘的范围和基础算法
  
  ```java
  static BigInteger factorial(int n){
      BigInteger s=new BigInteger("1");
      for(int i=2;i<=n;i++){
          BigInteger b=new BigInteger(Integer.toString(i));
          s=s.multiply(b);
      }
      return s;
  }
  ```
  
  
## 异常处理机制
- 异常及处理`try{}catch(Exception e){}`

- 动态扩容技术（数组异常的处理）

  ```java
  int a[] = new int[]{1, 2, 3};
  try {
      a[3]++;
  } catch (ArrayIndexOutOfBoundsException e) {
      int b[] = new int[a.length * 2];//倍增算法
      for (int i = 0; i < a.length; i++)
          b[i] = a[i];//拷贝原有数据
      a = b;//释放原来的空间
      a[3]++;
  }
  System.out.println(Arrays.toString(a));
  ```

  

- ##### 浮点数判断

  ```java
  boolean isNumber(String s) {
        try {
              double x = Double.parseDouble(s);
              return true;
          } catch (Exception e) {
              return false;
          }
  }
  ```
  
  

- 空栈异常的处理

## 后缀表达式的判断和计算
- 栈`java.util.Stack`
- 异常处理
- 模块化
  - 委托方法
  - 接口设计

## 洗牌和随机求解器
- 洗牌算法 `Collections.shuffle`
- 产生后缀式 调用求值模块来寻求解