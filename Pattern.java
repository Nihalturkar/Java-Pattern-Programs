class Pattern {
  public static void main(String[] args) {
    // square(5);
    // holosquare(5);
    // rhombus(5);
    // mirrorRhombus(5);
    // Rtriangle(5);
    // Pyramid(10);
    // HollowPyramid(9);
    // DownPyramid(7);
    // Diamondpattern(9);
    // HalfDiamond(5);
    // DownwardTriangle(5);
    // SandglassStar(8);
    // PrintAlphabet(9);
    // Number15(5);
    // Alphabet(5);
  }

  static void square(int n) {
    int i, j;
    for (i = 1; i <= n; i++) {
      for (j = 1; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void holosquare(int n) {
    int i, j;
    for (i = 1; i <= n; i++) {
      for (j = 1; j <= n; j++) {
        if ((i == 1 || j == 1) || (i == n || j == n)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  static void rhombus(int n) {
    int i, j;
    for (i = 1; i <= n; i++) {
      for (j = 1; j < i; j++) {
        System.out.print(" ");
      }
      for (j = 1; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void mirrorRhombus(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = n; j > i; j--) {
        System.out.print(" ");
      }
      for (int j = 1; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void Rtriangle(int n) {
    int i, j;
    for (i = 1; i <= n; i++) {
      for (j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void Pyramid(int n) {
    int i, j;
    int num = 1;
    for (i = 1; i <= n; i++) {
      for (j = n; j > i; j--) {
        System.out.print(" ");
      }
      for (j = 1; j <= num; j++) {
        System.out.print("*");
      }
      num += 2;
      System.out.println();
    }
  }

  static void HollowPyramid(int n) {
    int i, j;
    int num = 1;
    for (i = 1; i <= n; i++) {
      for (j = n; j > i; j--) {
        System.out.print(" ");
      }
      for (j = 1; j <= num; j++) {
        if (j == 1 || j == num || i == n)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      num += 2;
      System.out.println();
    }
  }

  static void DownPyramid(int n) {
    int i, j;
    for (i = 1; i <= n; i++) {
      for (j = 1; j <= i; j++) {
        System.out.print("-");
      }
      for (j = 1; j <= 2 * n - (2 * i - 1); j++) {
        System.out.print("*");
      }
      for (j = 1; j < i; j++) {
        System.out.print("-");
      }
      System.out.println();
    }
  }

  static void Diamondpattern(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= (2 * i - 1); j++) {
        System.out.print("*");
      }
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
    for (int k = 1; k <= n; k++) {
      for (int j = 1; j < k; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= 2 * n - (2 * k - 1); j++) {
        System.out.print("*");
      }
      for (int j = 1; j < k; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }

  static void HalfDiamond(int n) {
    int i, j;
    int k = 4;
    for (i = 1; i <= n; i++) {
      for (j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (i = 1; i <= n; i++) {
      for (j = 1; j <= k; j++) {
        System.out.print("*");
      }
      k = k - 1;
      System.out.println();
    }
  }

  static void DownwardTriangle(int n) {
    int i, j;
    for (i = 1; i <= n; i++) {
      for (j = n; j >= i; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void SandglassStar(int n) {
    int i, j;
    for (i = 1; i <= n; i++) {
      for (j = 1; j <= i; j++) {
        System.out.print(" ");
      }
      for (j = 1; j <= 2 * n - (2 * i - 1); j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    int num = 1;
    for (i = 1; i <= n; i++) {
      for (j = n; j >= i; j--) {
        System.out.print(" ");
      }
      for (j = 1; j <= num; j++) {
        System.out.print("*");
      }
      num += 2;
      System.out.println();
    }
  }

  static void PrintAlphabet(int n) {
    int i, j;
    for (i = 1; i <= n; i++) {
      // Print A
      for (j = 1; j <= n; j++) {
        if (i == 1 || j == 1 || j == n || i == (n + 1) / 2)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.print("   ");
      // print B
      for (j = 1; j <= n; j++) {
        if (i == 1 || j == 1 || j == n || i == (n + 1) / 2 || i == n)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.print("   ");

      // print C
      for (j = 1; j <= n; j++) {
        if (i == 1 || j == 1 || i == n)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.print("   ");
      // Print D
      for (j = 1; j <= n; j++) {
        if (i == 1 || j == 1 || i == n || j == n)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.print("   ");
      // Print E
      for (j = 1; j <= n; j++) {
        if (i == 1 || j == 1 || i == (n + 1) / 2 || i == n)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.print("   ");
      // Print F
      for (j = 1; j <= n; j++) {
        if (i == 1 || j == 1 || i == (n + 1) / 2)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.print("   ");
      // Print G
      for (j = 1; j <= n; j++) {
        if (i == 1 || j == 1 || i == n || (j == n && i >= (n + 1) / 2) || (i == (n + 1) / 2 && j >= (n + 1) / 2))
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.print("   ");
      // Print H
      for (j = 1; j <= n; j++) {
        if (j == 1 || j == n || i == (n + 1) / 2)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.print("   ");
      // Print I
      for (j = 1; j <= n; j++) {
        if (i == 1 || j == (n + 1) / 2 || i == n)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.print("   ");
      // Print J
      for (j = 1; j <= n; j++) {
        if (i == 1 || j == (n+1)/2 || (i==n&&j<=(n+1)/2)||(j==1&&i>=(n+1)/2))
          System.out.print("*");
        else
          System.out.print(" ");
      }
            System.out.print("   ");
    // Print K
  for(j=1;j<=n;j++){
      if(j==1||(i+j==n-1&&i<=(n+1)/2)||(i==j+2 &&i>(n+1)/2))
        System.out.print("*");
      else
      System.out.print(" ");
    } 
          System.out.print("   ");
    // Print L
  for(j=1;j<=n;j++){
      if(i==n||j==1)
        System.out.print("*");
      else
      System.out.print(" ");
    } 
          System.out.print("   ");
    // Print M
  for(j=1;j<=n;j++){
      if(j==n||j==1||(i==j&&i<=n/2)||(i+j==n&&j>n/2))
        System.out.print("*");
      else
      System.out.print(" ");
    } 
      System.out.println();
     
    }
     System.out.println();
     System.out.println();

    // from N to Z

    for(i=1;i<=n;i++){
      // print N
      for(j=1;j<=n;j++){
        if(j==1||j==n||i==j)
        System.out.print("*");
        else
        System.out.print(" ");
      }
      System.out.print("   ");
       // print O
      for(j=1;j<=n;j++){
        if(j==1||j==n||i==n||i==1)
        System.out.print("*");
        else
        System.out.print(" ");
      }
      System.out.print("   ");
       // print P
      for(j=1;j<=n;j++){
        if(j==1||(j==n&&i<=n/2)||i==n/2||i==1)
        System.out.print("*");
        else
        System.out.print(" ");
      }
      System.out.print("   ");
       // print Q
      for(j=1;j<=n;j++){
        if(j==1||j==n||i==n||i==1||(i==j&&i>n/2&&j>n/5))
        System.out.print("*");
        else
        System.out.print(" ");
      }
      System.out.print("   ");
       // print R
      for(j=1;j<=n;j++){
        if(j==1||(j==n&&i<=n/2)||i==n/2||(i==j&&i>n/2)||i==1)
        System.out.print("*");
        else
        System.out.print(" ");
      }
      System.out.print("   ");
       // print S
      for(j=1;j<=n;j++){
        if((j==1&&i<=(n+1)/2)||i==1||i==(n+1)/2||i==n||(j==n&&i>=(n+1)/2))
        System.out.print("*");
        else
        System.out.print(" ");
      }
      System.out.print("   ");
       // print T
      for(j=1;j<=n;j++){
        if(i==1||j==n/2)
        System.out.print("*");
        else
        System.out.print(" ");
      }
      System.out.print("   ");
       // print U
      for(j=1;j<=n;j++){
        if(j==1||j==n||i==n)
        System.out.print("*");
        else
        System.out.print(" ");
      }
      System.out.print("   ");
       // print V
      for(j=1;j<=n;j++){
        if((i==j&&j<=n/2)||(i+j==n-1&&j>=n/2))
        System.out.print("*");
        else
        System.out.print(" ");
      }
      System.out.print("   ");
       // print W
      for(j=1;j<=n;j++){
        if(j==1||j==n||(i+j==n+1&& i>n/2)||(i==j&&i>n/2))
        System.out.print("*");
        else
        System.out.print(" ");
      }
      System.out.print("   ");
       // print X
      for(j=1;j<=n;j++){
        if(i==j|| i+j==n+1)
        System.out.print("*");
        else
        System.out.print(" ");
      }
      System.out.print("   ");
       // print Y
      for(j=1;j<=n;j++){
        if((i==j&&j<=n/2)||(i+j==n-1&&j>=n/2)||(j==n/2&&i>n/2))
        System.out.print("*");
        else
        System.out.print(" ");
      }
      System.out.print("   ");
      // print Z
      for(j=1;j<=n;j++){
        if(i==1||i+j==n+1||i==n)
        System.out.print("*");
        else
        System.out.print(" ");
      }

      System.out.println();
    }

  }

  static void Number15(int n) {
    int num = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(num + " ");
        num = num + 1;
      }
      System.out.println();
    }
  }

  static void Alphabet(int n) {
    for (int i = 1; i <= n; i++) {
      for (char ch = 'A'; ch <= 'A' + (n - i); ch++) {
        System.out.print(ch);
      }
      System.out.println();
    }
  }


}
