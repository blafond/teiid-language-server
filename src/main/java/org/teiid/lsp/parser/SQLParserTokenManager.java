package org.teiid.lsp.parser;

/** Token Manager. */
public class SQLParserTokenManager implements SQLParserConstants
{
    int commentNestingDepth;

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0, long active1, long active2, long active3, long active4, long active5, long active6, long active7)
{
   switch (pos)
   {
      case 0:
         if ((active7 & 0x2L) != 0L)
            return 0;
         if ((active0 & 0xfffffffdfffffc00L) != 0L || (active1 & 0xffffffff801fffffL) != 0L || (active2 & 0xfffffffffe07ffffL) != 0L || (active3 & 0xc3fbffffffffffffL) != 0L || (active4 & 0xf7ffffbfff00001fL) != 0L || (active5 & 0xfff4ef3ffffefaf7L) != 0L || (active6 & 0xbf7fff7fL) != 0L)
         {
            jjmatchedKind = 417;
            return 59;
         }
         if ((active6 & 0x1000000000000L) != 0L)
            return 4;
         if ((active6 & 0x8000000000000L) != 0L)
            return 45;
         if ((active0 & 0x200000000L) != 0L || (active4 & 0xffffe0L) != 0L || (active5 & 0x2000000000000L) != 0L)
         {
            jjmatchedKind = 417;
            return 12;
         }
         if ((active1 & 0x7fe00000L) != 0L || (active2 & 0x1f80000L) != 0L || (active3 & 0x3c04000000000000L) != 0L || (active4 & 0x800004000000000L) != 0L || (active5 & 0x910c000010508L) != 0L || (active6 & 0x40800080L) != 0L)
         {
            jjmatchedKind = 417;
            return 60;
         }
         return -1;
      case 1:
         if ((active0 & 0x10180000084000L) != 0L || (active1 & 0x3ffc800000000000L) != 0L || (active2 & 0x636e00000L) != 0L || (active3 & 0x10300000080000L) != 0L || (active4 & 0x2000000000L) != 0L || (active5 & 0x800000041810L) != 0L || (active6 & 0x80L) != 0L)
            return 59;
         if ((active0 & 0xffefe7fffff7bc00L) != 0L || (active1 & 0xc0037fffffffffffL) != 0L || (active2 & 0xfffffff9c91fffffL) != 0L || (active3 & 0xffefcffffff7ffffL) != 0L || (active4 & 0xffffffdfffffffffL) != 0L || (active5 & 0xffff7ffffffbe7efL) != 0L || (active6 & 0xffffff7fL) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 417;
               jjmatchedPos = 1;
            }
            return 59;
         }
         return -1;
      case 2:
         if ((active0 & 0xffefe64df7f7fc00L) != 0L || (active1 & 0xe1fb7773ff7fd7ffL) != 0L || (active2 & 0xf9ffffc5e52f7fffL) != 0L || (active3 & 0xffef73fff7f7fc3bL) != 0L || (active4 & 0xf87fbdffff00001fL) != 0L || (active5 & 0xfffdffff803fffffL) != 0L || (active6 & 0xfbffdfffL) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 417;
               jjmatchedPos = 2;
            }
            return 59;
         }
         if ((active0 & 0x11b208080000L) != 0L || (active1 & 0xe00088c00802800L) != 0L || (active2 & 0x600003808908000L) != 0L || (active3 & 0x108c00080003c4L) != 0L || (active4 & 0x780420000ffffe0L) != 0L || (active5 & 0x200007fc00000L) != 0L || (active6 & 0x4002000L) != 0L)
            return 59;
         return -1;
      case 3:
         if ((active0 & 0xfc8be6480eebbc00L) != 0L || (active1 & 0x27fb174be70e77ffL) != 0L || (active2 & 0xf9ffffb5842ffecfL) != 0L || (active3 & 0xffe77469f770ff9bL) != 0L || (active4 & 0xf87f74fffeffffffL) != 0L || (active5 & 0xfe3fefb57ffe9e5bL) != 0L || (active6 & 0xf5ffcc6aL) != 0L)
         {
            if (jjmatchedPos != 3)
            {
               jjmatchedKind = 417;
               jjmatchedPos = 3;
            }
            return 59;
         }
         if ((active0 & 0x3640005f1144000L) != 0L || (active1 & 0xc800603018718000L) != 0L || (active2 & 0x400004061000130L) != 0L || (active3 & 0x8039608870020L) != 0L || (active4 & 0x890001000000L) != 0L || (active5 & 0x1c0104a800161a4L) != 0L || (active6 & 0xa001395L) != 0L)
            return 59;
         return -1;
      case 4:
         if ((active0 & 0xf2c360084e6abc00L) != 0L || (active1 & 0x278b114a760f75ffL) != 0L || (active2 & 0xf9bf3fa1842bce25L) != 0L || (active3 & 0xe72635c51676bb9bL) != 0L || (active4 & 0xf07f4cfffffbfff7L) != 0L || (active5 & 0xdf8feba6fffbfe13L) != 0L || (active6 & 0xb5f7ce6aL) != 0L)
         {
            if (jjmatchedPos != 4)
            {
               jjmatchedKind = 417;
               jjmatchedPos = 4;
            }
            return 59;
         }
         if ((active0 & 0xc08864000810000L) != 0L || (active1 & 0x70060181000200L) != 0L || (active2 & 0x40c014000430caL) != 0L || (active3 & 0x18c14028e1004400L) != 0L || (active4 & 0x800300000040008L) != 0L || (active5 & 0x2030141100040048L) != 0L || (active6 & 0x40080000L) != 0L)
            return 59;
         return -1;
      case 5:
         if ((active0 & 0x6042200002600400L) != 0L || (active1 & 0x100110246004480L) != 0L || (active2 & 0xf13800218402c000L) != 0L || (active3 & 0x10000c092003800L) != 0L || (active4 & 0x41000000020L) != 0L || (active5 & 0x10082904000a0000L) != 0L || (active6 & 0x24464820L) != 0L)
            return 59;
         if ((active0 & 0x928144084c0ab800L) != 0L || (active1 & 0x268b0048300f317fL) != 0L || (active2 & 0x8873f8000290e25L) != 0L || (active3 & 0xe6e635050476839bL) != 0L || (active4 & 0xf07f58effffbffd7L) != 0L || (active5 & 0xcf87c2a3fff1fe13L) != 0L || (active6 & 0x91b1864aL) != 0L)
         {
            if (jjmatchedPos != 5)
            {
               jjmatchedKind = 417;
               jjmatchedPos = 5;
            }
            return 59;
         }
         return -1;
      case 6:
         if ((active0 & 0x280440044420800L) != 0L || (active1 & 0x268b0040200f1107L) != 0L || (active2 & 0x887278000010821L) != 0L || (active3 & 0x86c034040036a393L) != 0L || (active4 & 0x70775087ffbbfec7L) != 0L || (active5 & 0x8f8fa287fff9fa11L) != 0L || (active6 & 0x11060aL) != 0L)
         {
            if (jjmatchedPos != 6)
            {
               jjmatchedKind = 417;
               jjmatchedPos = 6;
            }
            return 59;
         }
         if ((active0 & 0x900100080808b000L) != 0L || (active1 & 0x810002078L) != 0L || (active2 & 0x10180100280604L) != 0L || (active3 & 0x6026010104400008L) != 0L || (active4 & 0x8008086800400110L) != 0L || (active5 & 0x4000412000000402L) != 0L || (active6 & 0x91a08040L) != 0L)
            return 59;
         return -1;
      case 7:
         if ((active0 & 0x200440044400800L) != 0L || (active1 & 0x228a00000006107dL) != 0L || (active2 & 0x807270000000820L) != 0L || (active3 & 0xc030000026a283L) != 0L || (active4 & 0x30775007fe91fec6L) != 0L || (active5 & 0x898ba203fff9e210L) != 0L || (active6 & 0x1040aL) != 0L)
         {
            if (jjmatchedPos != 7)
            {
               jjmatchedKind = 417;
               jjmatchedPos = 7;
            }
            return 59;
         }
         if ((active0 & 0x80000000020000L) != 0L || (active1 & 0x401004020090102L) != 0L || (active2 & 0x80008000010001L) != 0L || (active3 & 0x8600040400100110L) != 0L || (active4 & 0x40000080012a0001L) != 0L || (active5 & 0x604008400001801L) != 0L || (active6 & 0x100200L) != 0L)
            return 59;
         return -1;
      case 8:
         if ((active0 & 0x400004400000L) != 0L || (active1 & 0x8000000006107dL) != 0L || (active2 & 0x6000000000820L) != 0L || (active3 & 0x8000100000062282L) != 0L || (active4 & 0x300340063c919c46L) != 0L || (active5 & 0x818220017ff88010L) != 0L || (active6 & 0x10402L) != 0L)
         {
            if (jjmatchedPos != 8)
            {
               jjmatchedKind = 417;
               jjmatchedPos = 8;
            }
            return 59;
         }
         if ((active0 & 0x200040040000800L) != 0L || (active1 & 0x220a000000000000L) != 0L || (active2 & 0x801270000000000L) != 0L || (active3 & 0xc0200000208001L) != 0L || (active4 & 0x741001c2006280L) != 0L || (active5 & 0x809820280016200L) != 0L || (active6 & 0x8L) != 0L)
            return 59;
         return -1;
      case 9:
         if ((active0 & 0x400000000000L) != 0L || (active1 & 0x8000000002007cL) != 0L || (active2 & 0x4000000000000L) != 0L || (active3 & 0x8080000000062082L) != 0L || (active4 & 0x20020007bc910846L) != 0L || (active5 & 0x808220007fd8e000L) != 0L)
         {
            jjmatchedKind = 417;
            jjmatchedPos = 9;
            return 59;
         }
         if ((active0 & 0x4400000L) != 0L || (active1 & 0x41001L) != 0L || (active2 & 0x2000000000820L) != 0L || (active3 & 0x100000000200L) != 0L || (active4 & 0x1001400000009400L) != 0L || (active5 & 0x100000100200010L) != 0L || (active6 & 0x10402L) != 0L)
            return 59;
         return -1;
      case 10:
         if ((active0 & 0x400000000000L) != 0L || (active1 & 0x2007cL) != 0L || (active3 & 0x8080000000060082L) != 0L || (active4 & 0x20001bc110042L) != 0L || (active5 & 0x808200007bd86000L) != 0L)
         {
            jjmatchedKind = 417;
            jjmatchedPos = 10;
            return 59;
         }
         if ((active1 & 0x80000000000000L) != 0L || (active2 & 0x4000000000000L) != 0L || (active3 & 0x2000L) != 0L || (active4 & 0x2000000600800804L) != 0L || (active5 & 0x200004008000L) != 0L)
            return 59;
         return -1;
      case 11:
         if ((active0 & 0x400000000000L) != 0L || (active1 & 0x20004L) != 0L || (active3 & 0x80000000060000L) != 0L || (active4 & 0x1bc010040L) != 0L || (active5 & 0x8082000031d84000L) != 0L)
         {
            if (jjmatchedPos != 11)
            {
               jjmatchedKind = 417;
               jjmatchedPos = 11;
            }
            return 59;
         }
         if ((active1 & 0x78L) != 0L || (active3 & 0x8000000000000082L) != 0L || (active4 & 0x2000000100002L) != 0L || (active5 & 0x4a002000L) != 0L)
            return 59;
         return -1;
      case 12:
         if ((active1 & 0x20L) != 0L || (active3 & 0x80000000040000L) != 0L || (active4 & 0x84000000L) != 0L || (active5 & 0x2000021d00000L) != 0L)
         {
            if (jjmatchedPos != 12)
            {
               jjmatchedKind = 417;
               jjmatchedPos = 12;
            }
            return 59;
         }
         if ((active0 & 0x400000000000L) != 0L || (active1 & 0x20004L) != 0L || (active3 & 0x20000L) != 0L || (active4 & 0x138010040L) != 0L || (active5 & 0x8080000010084000L) != 0L)
            return 59;
         return -1;
      case 13:
         if ((active3 & 0x80000000000000L) != 0L || (active4 & 0x84000000L) != 0L || (active5 & 0x2000001900000L) != 0L)
            return 59;
         if ((active1 & 0x20L) != 0L || (active3 & 0x40000L) != 0L || (active4 & 0x30000000L) != 0L || (active5 & 0x20400000L) != 0L)
         {
            jjmatchedKind = 417;
            jjmatchedPos = 13;
            return 59;
         }
         return -1;
      case 14:
         if ((active1 & 0x20L) != 0L || (active4 & 0x30000000L) != 0L || (active5 & 0x400000L) != 0L)
         {
            jjmatchedKind = 417;
            jjmatchedPos = 14;
            return 59;
         }
         if ((active3 & 0x40000L) != 0L || (active5 & 0x20000000L) != 0L)
            return 59;
         return -1;
      case 15:
         if ((active1 & 0x20L) != 0L || (active4 & 0x30000000L) != 0L || (active5 & 0x400000L) != 0L)
         {
            jjmatchedKind = 417;
            jjmatchedPos = 15;
            return 59;
         }
         return -1;
      case 16:
         if ((active1 & 0x20L) != 0L || (active4 & 0x20000000L) != 0L)
            return 59;
         if ((active4 & 0x10000000L) != 0L || (active5 & 0x400000L) != 0L)
         {
            jjmatchedKind = 417;
            jjmatchedPos = 16;
            return 59;
         }
         return -1;
      case 17:
         if ((active5 & 0x400000L) != 0L)
         {
            jjmatchedKind = 417;
            jjmatchedPos = 17;
            return 59;
         }
         if ((active4 & 0x10000000L) != 0L)
            return 59;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0, long active1, long active2, long active3, long active4, long active5, long active6, long active7)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0, active1, active2, active3, active4, active5, active6, active7), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x0L, 0x0L, 0x0L, 0x0L, 0x0L, 0x200000000000000L, 0x0L);
      case 36:
         return jjStopAtPos(0, 451);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x0L, 0x0L, 0x0L, 0x0L, 0x0L, 0x0L, 0x80L);
      case 40:
         return jjStopAtPos(0, 433);
      case 41:
         return jjStopAtPos(0, 434);
      case 42:
         return jjStopAtPos(0, 446);
      case 43:
         return jjStopAtPos(0, 448);
      case 44:
         return jjStopAtPos(0, 431);
      case 45:
         return jjStartNfaWithStates_0(0, 449, 0);
      case 46:
         return jjStartNfaWithStates_0(0, 432, 4);
      case 47:
         jjmatchedKind = 447;
         return jjMoveStringLiteralDfa1_0(0x20L, 0x0L, 0x0L, 0x0L, 0x0L, 0x0L, 0x0L, 0x0L);
      case 58:
         return jjStopAtPos(0, 453);
      case 59:
         return jjStopAtPos(0, 452);
      case 60:
         jjmatchedKind = 442;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x0L, 0x0L, 0x0L, 0x0L, 0x0L, 0x900000000000000L, 0x0L);
      case 61:
         return jjStopAtPos(0, 439);
      case 62:
         jjmatchedKind = 444;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x0L, 0x0L, 0x0L, 0x0L, 0x0L, 0x2000000000000000L, 0x0L);
      case 63:
         return jjStopAtPos(0, 450);
      case 91:
         return jjStopAtPos(0, 437);
      case 93:
         return jjStopAtPos(0, 438);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa1_0(0x7ff000000000L, 0x0L, 0x0L, 0x3c0000000000L, 0x100000000000000L, 0xa000000100180000L, 0x1000020L, 0x0L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa1_0(0x1f800084606000L, 0x0L, 0x0L, 0x0L, 0x0L, 0x0L, 0x0L, 0x0L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa1_0(0xffe0000d00040000L, 0x7ffL, 0x0L, 0x400000000000L, 0xc300000000000L, 0x20010000000002L, 0x48L, 0x0L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa1_0(0x1a000000L, 0x1ff800L, 0x0L, 0x3800000000000L, 0x1008fff000000L, 0x4000020000000001L, 0x40300L, 0x0L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x7fe00000L, 0x0L, 0x4000000000000L, 0x800004000000000L, 0x9008000000408L, 0x40800000L, 0x0L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa1_0(0x800000L, 0x7f80000000L, 0x0L, 0x8000000000000L, 0x40000000000000L, 0x40L, 0x4000000L, 0x0L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x78000000000L, 0x0L, 0x0L, 0x0L, 0xc00000000000000L, 0x0L, 0x0L);
      case 72:
      case 104:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x780000000000L, 0x0L, 0x0L, 0x0L, 0x80000000000L, 0x10000000L, 0x0L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa1_0(0x80000L, 0x3fff800000000000L, 0x0L, 0x10000000000000L, 0x3000000000L, 0x800000040000L, 0x0L, 0x0L);
      case 74:
      case 106:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x4000000000000000L, 0x0L, 0x0L, 0x0L, 0x1c0000200000000L, 0x4L, 0x0L);
      case 75:
      case 107:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x0L, 0x0L, 0x0L, 0x20000000000L, 0x0L, 0x0L, 0x0L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa1_0(0x100000L, 0x8000000000000000L, 0x1ffL, 0xe0000000000000L, 0x0L, 0x80L, 0x200000L, 0x0L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x0L, 0x7fe00L, 0x300000000000000L, 0x600000000000000L, 0x0L, 0x10L, 0x0L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x0L, 0x1f80000L, 0x3c00000000000000L, 0x0L, 0x104000010100L, 0x80L, 0x0L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x0L, 0xfffe000000L, 0x0L, 0x0L, 0x200000000010L, 0x400000L, 0x0L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x0L, 0x3f0000000000L, 0x0L, 0x22000000000000L, 0x200002000000020L, 0x20100400L, 0x0L);
      case 81:
      case 113:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x0L, 0x0L, 0x0L, 0x0L, 0x40000008000L, 0x80000000L, 0x0L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa1_0(0x1000000L, 0x0L, 0x7ffc00000000000L, 0x4000000000000000L, 0xc00000000000L, 0x10000000020000L, 0x31000L, 0x0L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa1_0(0x30400L, 0x0L, 0xf800000000000000L, 0x8000000000003fffL, 0x3080040000000003L, 0xc7fc00200L, 0x4800L, 0x0L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa1_0(0x60008000L, 0x0L, 0x0L, 0xffc000L, 0x8000000000cL, 0x80007804L, 0x2000003L, 0x0L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x0L, 0x0L, 0x3f000000L, 0x10000000000000L, 0x1000000000000000L, 0x82000L, 0x0L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa1_0(0x1800L, 0x0L, 0x0L, 0x1c0000000L, 0xc000010000000010L, 0x4400000000000L, 0x0L, 0x0L);
      case 87:
      case 119:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x0L, 0x0L, 0x1fe00000000L, 0x0L, 0x1000200000L, 0x8000L, 0x0L);
      case 88:
      case 120:
         return jjMoveStringLiteralDfa1_0(0x200000000L, 0x0L, 0x0L, 0x0L, 0xffffe0L, 0x2000000000000L, 0x0L, 0x0L);
      case 89:
      case 121:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x0L, 0x0L, 0x20000000000L, 0x0L, 0x0L, 0x8000000L, 0x0L);
      case 123:
         return jjStartNfaWithStates_0(0, 435, 45);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x0L, 0x0L, 0x0L, 0x0L, 0x0L, 0x0L, 0x40L);
      case 125:
         return jjStopAtPos(0, 436);
      default :
         return jjMoveNfa_0(2, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0, long active1, long active2, long active3, long active4, long active5, long active6, long active7)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0, active1, active2, active3, active4, active5, active6, active7);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active7 & 0x80L) != 0L)
            return jjStopAtPos(1, 455);
         break;
      case 42:
         if ((active0 & 0x20L) != 0L)
            return jjStopAtPos(1, 5);
         break;
      case 61:
         if ((active6 & 0x200000000000000L) != 0L)
            return jjStopAtPos(1, 441);
         else if ((active6 & 0x800000000000000L) != 0L)
            return jjStopAtPos(1, 443);
         else if ((active6 & 0x2000000000000000L) != 0L)
            return jjStopAtPos(1, 445);
         break;
      case 62:
         if ((active6 & 0x100000000000000L) != 0L)
            return jjStopAtPos(1, 440);
         break;
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x1e0000410001800L, active1, 0x180080200800L, active2, 0x800430000081e03L, active3, 0x4200000c0004000L, active4, 0xc400800001000010L, active5, 0x140060000100a0L, active6, 0x18000314L, active7, 0L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0L, active5, 0x200000000000L, active6, 0x400000L, active7, 0L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0L, active2, 0x1000000000000000L, active3, 0x1800000000000000L, active4, 0L, active5, 0x80000L, active6, 0x820L, active7, 0L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000000L, active1, 0x1000000000000L, active2, 0L, active3, 0L, active4, 0L, active5, 0L, active6, 0L, active7, 0L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x1800009000000L, active1, 0x800000810003f000L, active2, 0xe03f80000010600cL, active3, 0x4101820000008007L, active4, 0x30e0000000000L, active5, 0x4c004a0480220100L, active6, 0x2034000L, active7, 0L);
      case 70:
      case 102:
         if ((active1 & 0x800000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 111, 59);
         else if ((active2 & 0x2000000L) != 0L)
         {
            jjmatchedKind = 153;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0L, active2, 0x4000000L, active3, 0L, active4, 0L, active5, 0x2000000000000000L, active6, 0L, active7, 0L);
      case 72:
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x600000000050000L, active1, 0L, active2, 0L, active3, 0x2e00010000L, active4, 0L, active5, 0x20000000000000L, active6, 0L, active7, 0L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000064608000L, active1, 0x2000c0000L, active2, 0x40000000008070L, active3, 0x1d100060008L, active4, 0x200018000000000L, active5, 0x1000006040L, active6, 0x200000L, active7, 0L);
      case 75:
      case 107:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0L, active5, 0x800000000L, active6, 0L, active7, 0L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x800006180800000L, active1, 0x10000400000L, active2, 0x8000000L, active3, 0x4040000000000L, active4, 0xffe000000L, active5, 0L, active6, 0L, active7, 0L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0x200020000L, active1, 0x2000000000000L, active2, 0L, active3, 0L, active4, 0x1000ffffe0L, active5, 0x2000000000008L, active6, 0L, active7, 0L);
      case 78:
      case 110:
         if ((active1 & 0x4000000000000L) != 0L)
         {
            jjmatchedKind = 114;
            jjmatchedPos = 1;
         }
         else if ((active2 & 0x10000000L) != 0L)
         {
            jjmatchedKind = 156;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x18000080000L, active1, 0xff8000000800000L, active2, 0x20000000L, active3, 0x10000007000000L, active4, 0x10006000000000L, active5, 0x808000040000L, active6, 0x1000000L, active7, 0L);
      case 79:
      case 111:
         if ((active2 & 0x400000L) != 0L)
         {
            jjmatchedKind = 150;
            jjmatchedPos = 1;
         }
         else if ((active3 & 0x80000L) != 0L)
         {
            jjmatchedKind = 211;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0xf004000802102000L, active1, 0x4000600c00000007L, active2, 0x780000000a70180L, active3, 0xc0000000000020L, active4, 0x40700000000000L, active5, 0x10000001803L, active6, 0x241410c8L, active7, 0L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0L, active2, 0x1c0000000L, active3, 0x8000000010000010L, active4, 0L, active5, 0x1000000000000000L, active6, 0x40000000L, active7, 0L);
      case 81:
      case 113:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0L, active2, 0L, active3, 0x3c0L, active4, 0L, active5, 0x7fc00000L, active6, 0L, active7, 0L);
      case 82:
      case 114:
         if ((active2 & 0x200000000L) != 0L)
         {
            jjmatchedKind = 161;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x8060000000000L, active1, 0x61001100380L, active2, 0x3c0400000000L, active3, 0x8080000f00000L, active4, 0x2000000000000cL, active5, 0x200000100000014L, active6, 0x8402L, active7, 0L);
      case 83:
      case 115:
         if ((active0 & 0x80000000000L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 1;
         }
         else if ((active1 & 0x1000000000000000L) != 0L)
         {
            jjmatchedKind = 124;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x100000000000L, active1, 0x2000000002000000L, active2, 0L, active3, 0x300028000000L, active4, 0L, active5, 0x1c0000200000000L, active6, 0x82000L, active7, 0L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000000400L, active1, 0L, active2, 0L, active3, 0xc00L, active4, 0x3000000000000000L, active5, 0L, active6, 0L, active7, 0L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000000L, active1, 0x6000000478L, active2, 0x3801000000L, active3, 0x2200000000000000L, active4, 0x8c000000000002L, active5, 0x8000140000108200L, active6, 0x80000000L, active7, 0L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0L, active2, 0xc000000000L, active3, 0L, active4, 0x900000000000000L, active5, 0L, active6, 0L, active7, 0L);
      case 88:
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x7c000000L, active2, 0L, active3, 0L, active4, 0L, active5, 0x9000000000400L, active6, 0x800000L, active7, 0L);
      case 89:
      case 121:
         if ((active0 & 0x10000000000000L) != 0L)
         {
            jjmatchedKind = 52;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x4000L, active1, 0L, active2, 0L, active3, 0x2400000003000L, active4, 0x1L, active5, 0L, active6, 0x1L, active7, 0L);
      case 124:
         if ((active7 & 0x40L) != 0L)
            return jjStopAtPos(1, 454);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0, active1, active2, active3, active4, active5, active6, active7);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0, long old1, long active1, long old2, long active2, long old3, long active3, long old4, long active4, long old5, long active5, long old6, long active6, long old7, long active7)
{
   if (((active0 &= old0) | (active1 &= old1) | (active2 &= old2) | (active3 &= old3) | (active4 &= old4) | (active5 &= old5) | (active6 &= old6) | (active7 &= old7)) == 0L)
      return jjStartNfa_0(0, old0, old1, old2, old3, old4, old5, old6, old7);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0, active1, active2, active3, active4, active5, active6, 0L);
      return 2;
   }
   switch(curChar)
   {
      case 95:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0L, active5, 0x1800L, active6, 0L);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000001060000L, active1, 0x20000001000L, active2, 0x200080000000000cL, active3, 0x20000300c00L, active4, 0x4000000004L, active5, 0x20080000000000L, active6, 0x81088006L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0L, active2, 0L, active3, 0x4000L, active4, 0x10000000000002L, active5, 0x200L, active6, 0L);
      case 67:
      case 99:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 44, 59);
         else if ((active3 & 0x800000000000L) != 0L)
         {
            jjmatchedKind = 239;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000L, active1, 0x6202000L, active2, 0x4001000000200080L, active3, 0xc0400000000000L, active4, 0L, active5, 0x9808000080001L, active6, 0x20L);
      case 68:
      case 100:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 36, 59);
         else if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 39, 59);
         else if ((active1 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(2, 87, 59);
         else if ((active2 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(2, 155, 59);
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x8000000000000L, active2, 0x400030000L, active3, 0x10000000L, active4, 0x3000000000000000L, active5, 0x1000040010L, active6, 0L);
      case 69:
      case 101:
         if ((active3 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 235, 59);
         else if ((active6 & 0x2000L) != 0L)
         {
            jjmatchedKind = 397;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x408000000000000L, active1, 0x1000018000080L, active2, 0xcc040000000L, active3, 0x800c100e08010010L, active4, 0x820010000000008L, active5, 0x200000000008000L, active6, 0L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x8000000000000000L, active2, 0x6000004000000L, active3, 0L, active4, 0L, active5, 0x4000000000000000L, active6, 0L);
      case 71:
      case 103:
         if ((active4 & 0x100000000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 312, 59);
         return jjMoveStringLiteralDfa3_0(active0, 0x800004600000L, active1, 0L, active2, 0x40000000000000L, active3, 0L, active4, 0L, active5, 0L, active6, 0L);
      case 72:
      case 104:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0L, active2, 0L, active3, 0x800000000000000L, active4, 0L, active5, 0L, active6, 0x800L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x4000000040000100L, active2, 0x100000000000L, active3, 0x2023400000L, active4, 0L, active5, 0x10000800000004L, active6, 0x400L);
      case 74:
      case 106:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0L, active5, 0x200000000000L, active6, 0x400000L);
      case 75:
      case 107:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0L, active2, 0xe30L, active3, 0x4000000L, active4, 0L, active5, 0L, active6, 0L);
      case 76:
      case 108:
         if ((active0 & 0x200000000L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x2000000000L) != 0L)
         {
            jjmatchedKind = 37;
            jjmatchedPos = 2;
         }
         else if ((active3 & 0x40L) != 0L)
         {
            jjmatchedKind = 198;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x3060000000000000L, active1, 0x202280004000L, active2, 0x8180000021000000L, active3, 0x52000400c0000380L, active4, 0x40000000ffffe0L, active5, 0x213047fe00000L, active6, 0x20001000L);
      case 77:
      case 109:
         if ((active4 & 0x80000000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 311, 59);
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000060000000L, active1, 0x2000000000000L, active2, 0x40L, active3, 0x2100000000068028L, active4, 0x4000000000001L, active5, 0x4000016000L, active6, 0x8040000L);
      case 78:
      case 110:
         if ((active4 & 0x200000000000000L) != 0L)
         {
            jjmatchedKind = 313;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x8002000800108000L, active1, 0x10004000000003L, active2, 0x400000048001L, active3, 0x2004000000001L, active4, 0x1800002000000L, active5, 0x2L, active6, 0x100200c8L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x800200180812000L, active1, 0x2040051000100200L, active2, 0x200000000100L, active3, 0L, active4, 0L, active5, 0xdc0040200000000L, active6, 0x40000000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x20000000000000L, active2, 0L, active3, 0L, active4, 0x1004000000L, active5, 0x8L, active6, 0x810001L);
      case 82:
      case 114:
         if ((active1 & 0x400000000L) != 0L)
         {
            jjmatchedKind = 98;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x60000001c00L, active1, 0x80100047cL, active2, 0x1000030000002002L, active3, 0x1000100000000L, active4, 0xc00a040000000010L, active5, 0x4400100000040L, active6, 0x4004000L);
      case 83:
      case 115:
         if ((active1 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 107, 59);
         return jjMoveStringLiteralDfa3_0(active0, 0x180000400000000L, active1, 0x1800000004d8000L, active2, 0L, active3, 0x3002L, active4, 0xa000000000L, active5, 0x1000002000020080L, active6, 0x300010L);
      case 84:
      case 116:
         if ((active1 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 103, 59);
         else if ((active2 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(2, 151, 59);
         else if ((active2 & 0x800000000L) != 0L)
         {
            jjmatchedKind = 163;
            jjmatchedPos = 2;
         }
         else if ((active3 & 0x4L) != 0L)
            return jjStartNfaWithStates_0(2, 194, 59);
         else if ((active3 & 0x10000000000000L) != 0L)
         {
            jjmatchedKind = 244;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x5404010084000L, active1, 0xe00000120020000L, active2, 0x18003180085000L, active3, 0x420019000000000L, active4, 0x1000000L, active5, 0xa000000000100420L, active6, 0x300L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000L, active1, 0x400000000000L, active2, 0L, active3, 0x800000L, active4, 0x3007f8000000L, active5, 0L, active6, 0L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x100000000000L, active2, 0x820000000000000L, active3, 0L, active4, 0x800000000L, active5, 0L, active6, 0L);
      case 87:
      case 119:
         if ((active2 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(2, 148, 59);
         else if ((active2 & 0x200000000000000L) != 0L)
         {
            jjmatchedKind = 185;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0L, active2, 0x400000000000000L, active3, 0L, active4, 0x400000000000L, active5, 0L, active6, 0L);
      case 88:
      case 120:
         if ((active4 & 0x400000000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 314, 59);
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0x80000000000L, active5, 0x80000100L, active6, 0x2000000L);
      case 89:
      case 121:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 40, 59);
         else if ((active1 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(2, 75, 59);
         else if ((active4 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 297, 59);
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0L, active2, 0L, active3, 0x200000000000L, active4, 0L, active5, 0L, active6, 0L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0, active1, active2, active3, active4, active5, active6, 0L);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0, long old1, long active1, long old2, long active2, long old3, long active3, long old4, long active4, long old5, long active5, long old6, long active6)
{
   if (((active0 &= old0) | (active1 &= old1) | (active2 &= old2) | (active3 &= old3) | (active4 &= old4) | (active5 &= old5) | (active6 &= old6)) == 0L)
      return jjStartNfa_0(1, old0, old1, old2, old3, old4, old5, old6, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0, active1, active2, active3, active4, active5, active6, 0L);
      return 3;
   }
   switch(curChar)
   {
      case 95:
         return jjMoveStringLiteralDfa4_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0xc000400000000000L, active5, 0x7fc00000L, active6, 0L);
      case 65:
      case 97:
         if ((active6 & 0x100L) != 0L)
         {
            jjmatchedKind = 392;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0xa060000800000L, active1, 0x2000080L, active2, 0x10000200080L, active3, 0x8c2000010000000L, active4, 0x8801000068L, active5, 0x4000000100000000L, active6, 0x60200L);
      case 66:
      case 98:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(3, 31, 59);
         else if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(3, 32, 59);
         return jjMoveStringLiteralDfa4_0(active0, 0x2000800L, active1, 0x10000000000L, active2, 0L, active3, 0x100000000000000L, active4, 0x4000000080L, active5, 0x1000L, active6, 0L);
      case 67:
      case 99:
         if ((active1 & 0x8000L) != 0L)
         {
            jjmatchedKind = 79;
            jjmatchedPos = 3;
         }
         else if ((active1 & 0x8000000L) != 0L)
         {
            jjmatchedKind = 91;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x480000000001000L, active1, 0x4110050000L, active2, 0x240000001000L, active3, 0x8000000000000010L, active4, 0x22000000000700L, active5, 0x800L, active6, 0x40000000L);
      case 68:
      case 100:
         if ((active1 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 109, 59);
         return jjMoveStringLiteralDfa4_0(active0, 0x4000000L, active1, 0L, active2, 0x800000000004L, active3, 0x4000000000L, active4, 0x3000000000000800L, active5, 0x2080000000000L, active6, 0x10000008L);
      case 69:
      case 101:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(3, 14, 59);
         else if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(3, 28, 59);
         else if ((active0 & 0x20000000L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 3;
         }
         else if ((active0 & 0x100000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 56, 59);
         else if ((active1 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(3, 86, 59);
         else if ((active2 & 0x10L) != 0L)
         {
            jjmatchedKind = 132;
            jjmatchedPos = 3;
         }
         else if ((active3 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(3, 197, 59);
         else if ((active3 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(3, 215, 59);
         else if ((active3 & 0x8000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 243, 59);
         else if ((active5 & 0x4000000000L) != 0L)
         {
            jjmatchedKind = 358;
            jjmatchedPos = 3;
         }
         else if ((active6 & 0x1L) != 0L)
            return jjStartNfaWithStates_0(3, 384, 59);
         else if ((active6 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(3, 391, 59);
         else if ((active6 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(3, 396, 59);
         return jjMoveStringLiteralDfa4_0(active0, 0x4040080000L, active1, 0x792000824024000L, active2, 0x8806001400000e20L, active3, 0x6021000000060080L, active4, 0x4000002003001L, active5, 0x30082004000d6000L, active6, 0x400820L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa4_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0x4000L, active5, 0L, active6, 0L);
      case 71:
      case 103:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(3, 20, 59);
         return jjMoveStringLiteralDfa4_0(active0, 0L, active1, 0L, active2, 0x400000002003L, active3, 0x400000L, active4, 0L, active5, 0x800000000000000L, active6, 0x80000L);
      case 72:
      case 104:
         if ((active0 & 0x4000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 50, 59);
         else if ((active1 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(3, 85, 59);
         else if ((active3 & 0x1000000000L) != 0L)
         {
            jjmatchedKind = 228;
            jjmatchedPos = 3;
         }
         else if ((active5 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(3, 325, 59);
         return jjMoveStringLiteralDfa4_0(active0, 0x400000000000L, active1, 0L, active2, 0x40000000004000L, active3, 0x18000000000L, active4, 0L, active5, 0x8000000000000000L, active6, 0L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x800008600400L, active1, 0x8100000000000L, active2, 0x180010040L, active3, 0x400000000100008L, active4, 0x40000008000L, active5, 0x24020000000010L, active6, 0x20100000L);
      case 75:
      case 107:
         if ((active4 & 0x800000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 303, 59);
         else if ((active6 & 0x10L) != 0L)
            return jjStartNfaWithStates_0(3, 388, 59);
         break;
      case 76:
      case 108:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(3, 24, 59);
         else if ((active0 & 0x20000000000000L) != 0L)
         {
            jjmatchedKind = 53;
            jjmatchedPos = 3;
         }
         else if ((active1 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 101, 59);
         else if ((active2 & 0x1000000L) != 0L)
         {
            jjmatchedKind = 152;
            jjmatchedPos = 3;
         }
         else if ((active6 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(3, 411, 59);
         return jjMoveStringLiteralDfa4_0(active0, 0x1040000000022000L, active1, 0x2000000000003000L, active2, 0x180000000000000L, active3, 0x402000004000L, active4, 0x40000000000000L, active5, 0x1900000200000L, active6, 0x1800000L);
      case 77:
      case 109:
         if ((active1 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 100, 59);
         else if ((active5 & 0x4L) != 0L)
            return jjStartNfaWithStates_0(3, 322, 59);
         return jjMoveStringLiteralDfa4_0(active0, 0x4000200000000000L, active1, 0L, active2, 0x100000000000L, active3, 0x4200000000000L, active4, 0x2L, active5, 0x400000000000000L, active6, 0x4000000L);
      case 78:
      case 110:
         if ((active1 & 0x4000000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 126, 59);
         else if ((active2 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(3, 158, 59);
         else if ((active3 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(3, 208, 59);
         else if ((active3 & 0x200000000L) != 0L)
         {
            jjmatchedKind = 225;
            jjmatchedPos = 3;
         }
         else if ((active5 & 0x40000000000000L) != 0L)
         {
            jjmatchedKind = 374;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000000000000L, active1, 0x1020000000000L, active2, 0L, active3, 0x100424200000L, active4, 0x300000010004L, active5, 0x180000200000000L, active6, 0x2L);
      case 79:
      case 111:
         if ((active1 & 0x800000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 123, 59);
         return jjMoveStringLiteralDfa4_0(active0, 0L, active1, 0x1000000L, active2, 0x5020000000000000L, active3, 0x1000040001000000L, active4, 0x10001000000000L, active5, 0x8000100000L, active6, 0x10000L);
      case 80:
      case 112:
         if ((active1 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(3, 84, 59);
         else if ((active2 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(3, 136, 59);
         else if ((active5 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(3, 355, 59);
         return jjMoveStringLiteralDfa4_0(active0, 0L, active1, 0L, active2, 0x82000000000L, active3, 0x8000L, active4, 0x60000L, active5, 0L, active6, 0x8000L);
      case 81:
      case 113:
         return jjMoveStringLiteralDfa4_0(active0, 0L, active1, 0L, active2, 0L, active3, 0x2000000L, active4, 0x80000L, active5, 0L, active6, 0L);
      case 82:
      case 114:
         if ((active0 & 0x40000L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 3;
         }
         else if ((active1 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 110, 59);
         else if ((active2 & 0x4000000000L) != 0L)
         {
            jjmatchedKind = 166;
            jjmatchedPos = 3;
         }
         else if ((active3 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(3, 219, 59);
         else if ((active3 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 233, 59);
         return jjMoveStringLiteralDfa4_0(active0, 0x200000000010000L, active1, 0x7cL, active2, 0x2000008000000000L, active3, 0x800000400L, active4, 0x8080007fc000000L, active5, 0x8400L, active6, 0x80000000L);
      case 83:
      case 115:
         if ((active2 & 0x400000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 186, 59);
         else if ((active6 & 0x4L) != 0L)
            return jjStartNfaWithStates_0(3, 386, 59);
         return jjMoveStringLiteralDfa4_0(active0, 0x800000000000000L, active1, 0xc0000601L, active2, 0x4000000L, active3, 0x103L, active4, 0x1000000100000L, active5, 0x210402000000240L, active6, 0L);
      case 84:
      case 116:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(3, 34, 59);
         else if ((active1 & 0x8000000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 127, 59);
         else if ((active5 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(3, 327, 59);
         else if ((active5 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(3, 328, 59);
         else if ((active6 & 0x2000000L) != 0L)
         {
            jjmatchedKind = 409;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0L, active1, 0x200080102L, active2, 0x20000040000L, active3, 0x200000100003800L, active4, 0x82000600000L, active5, 0x4108000000aL, active6, 0x200040L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000000000000L, active1, 0x60040000000000L, active2, 0x190000000a8000L, active3, 0xc0000000L, active4, 0L, active5, 0x10000020001L, active6, 0L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000000L, active1, 0L, active2, 0x8L, active3, 0L, active4, 0x800000L, active5, 0L, active6, 0x4400L);
      case 87:
      case 119:
         if ((active4 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 296, 59);
         return jjMoveStringLiteralDfa4_0(active0, 0x1000000000000L, active1, 0L, active2, 0L, active3, 0x200L, active4, 0L, active5, 0L, active6, 0L);
      case 89:
      case 121:
         if ((active2 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(3, 157, 59);
         return jjMoveStringLiteralDfa4_0(active0, 0x8000L, active1, 0L, active2, 0L, active3, 0L, active4, 0x10L, active5, 0L, active6, 0L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0, active1, active2, active3, active4, active5, active6, 0L);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0, long old1, long active1, long old2, long active2, long old3, long active3, long old4, long active4, long old5, long active5, long old6, long active6)
{
   if (((active0 &= old0) | (active1 &= old1) | (active2 &= old2) | (active3 &= old3) | (active4 &= old4) | (active5 &= old5) | (active6 &= old6)) == 0L)
      return jjStartNfa_0(2, old0, old1, old2, old3, old4, old5, old6, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0, active1, active2, active3, active4, active5, active6, 0L);
      return 4;
   }
   switch(curChar)
   {
      case 95:
         return jjMoveStringLiteralDfa5_0(active0, 0L, active1, 0L, active2, 0x20L, active3, 0L, active4, 0x4000000000000L, active5, 0x100000L, active6, 0L);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x1280000000000000L, active1, 0x2000010000002000L, active2, 0x180000000000L, active3, 0x4000000000000200L, active4, 0xc0000a30100L, active5, 0x84000000000400L, active6, 0x4a00000L);
      case 66:
      case 98:
         if ((active3 & 0x1000000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 252, 59);
         return jjMoveStringLiteralDfa5_0(active0, 0L, active1, 0L, active2, 0x80000000000000L, active3, 0L, active4, 0x8000000000L, active5, 0L, active6, 0x200L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0L, active1, 0x8000000000000L, active2, 0xa000000000200000L, active3, 0x40000000000L, active4, 0L, active5, 0x200400000000L, active6, 0x20400000L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa5_0(active0, 0L, active1, 0x2000000000000L, active2, 0x200L, active3, 0L, active4, 0L, active5, 0x8000000000L, active6, 0L);
      case 69:
      case 101:
         if ((active0 & 0x800000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 59, 59);
         else if ((active1 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(4, 95, 59);
         else if ((active2 & 0x2L) != 0L)
            return jjStartNfaWithStates_0(4, 129, 59);
         else if ((active2 & 0x8L) != 0L)
            return jjStartNfaWithStates_0(4, 131, 59);
         else if ((active2 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(4, 141, 59);
         else if ((active2 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 174, 59);
         else if ((active3 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(4, 206, 59);
         else if ((active3 & 0x40000000L) != 0L)
         {
            jjmatchedKind = 222;
            jjmatchedPos = 4;
         }
         else if ((active3 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(4, 227, 59);
         else if ((active3 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 229, 59);
         else if ((active3 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 238, 59);
         else if ((active5 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 362, 59);
         else if ((active5 & 0x10000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 372, 59);
         else if ((active6 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(4, 403, 59);
         return jjMoveStringLiteralDfa5_0(active0, 0x8041000804002000L, active1, 0x20000017cL, active2, 0x200004000000L, active3, 0x104200480003000L, active4, 0x302b002004500000L, active5, 0x8602080000000002L, active6, 0x4000L);
      case 70:
      case 102:
         if ((active3 & 0x1000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 240, 59);
         return jjMoveStringLiteralDfa5_0(active0, 0L, active1, 0L, active2, 0x10000L, active3, 0L, active4, 0L, active5, 0x200000L, active6, 0L);
      case 71:
      case 103:
         if ((active3 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(4, 221, 59);
         return jjMoveStringLiteralDfa5_0(active0, 0x80000L, active1, 0L, active2, 0L, active3, 0x400000L, active4, 0x20L, active5, 0L, active6, 0L);
      case 72:
      case 104:
         if ((active1 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(4, 96, 59);
         else if ((active2 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(4, 140, 59);
         else if ((active2 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(4, 146, 59);
         else if ((active5 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 356, 59);
         else if ((active6 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(4, 414, 59);
         return jjMoveStringLiteralDfa5_0(active0, 0x1000L, active1, 0L, active2, 0L, active3, 0L, active4, 0L, active5, 0x800L, active6, 0L);
      case 73:
      case 105:
         if ((active4 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(4, 274, 59);
         return jjMoveStringLiteralDfa5_0(active0, 0x4000200000008800L, active1, 0x800080002L, active2, 0x60000000404L, active3, 0x8200008000000813L, active4, 0x90L, active5, 0x402000000000L, active6, 0x40408L);
      case 75:
      case 107:
         if ((active0 & 0x8000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 51, 59);
         else if ((active0 & 0x400000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 58, 59);
         return jjMoveStringLiteralDfa5_0(active0, 0L, active1, 0L, active2, 0x20000000000000L, active3, 0L, active4, 0L, active5, 0L, active6, 0L);
      case 76:
      case 108:
         if ((active2 & 0x80L) != 0L)
         {
            jjmatchedKind = 135;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x2020000L, active1, 0x1000L, active2, 0x1000008000020000L, active3, 0xc0000000100008L, active4, 0x4ff9001000L, active5, 0x20000L, active6, 0x10000000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000000008000000L, active1, 0L, active2, 0x10000000000L, active3, 0x2000000000000L, active4, 0L, active5, 0x30000000001L, active6, 0x20800L);
      case 78:
      case 110:
         if ((active0 & 0x800000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 47, 59);
         else if ((active3 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(4, 216, 59);
         else if ((active5 & 0x20000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 373, 59);
         return jjMoveStringLiteralDfa5_0(active0, 0x600400L, active1, 0x80100000000000L, active2, 0x4000000000000800L, active3, 0L, active4, 0x400000000000L, active5, 0x10L, active6, 0L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000000000L, active1, 0x40400L, active2, 0x180004000L, active3, 0x400014004008000L, active4, 0x40000000004e00L, active5, 0x100000000000000L, active6, 0L);
      case 80:
      case 112:
         if ((active1 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 106, 59);
         return jjMoveStringLiteralDfa5_0(active0, 0L, active1, 0x6000000L, active2, 0x800000000000000L, active3, 0L, active4, 0x8000000000000000L, active5, 0x8000000000000L, active6, 0x8000L);
      case 82:
      case 114:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 38, 59);
         else if ((active1 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(4, 88, 59);
         else if ((active1 & 0x10000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 116, 59);
         else if ((active2 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(4, 162, 59);
         else if ((active2 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 164, 59);
         else if ((active3 & 0x800000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 251, 59);
         else if ((active5 & 0x2000000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 381, 59);
         return jjMoveStringLiteralDfa5_0(active0, 0x2000000000000L, active1, 0x700000020030000L, active2, 0x1f000000080000L, active3, 0x2020000000000000L, active4, 0x1000000000L, active5, 0x1800000000000000L, active6, 0x40L);
      case 83:
      case 115:
         if ((active1 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(4, 73, 59);
         else if ((active2 & 0x800000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 175, 59);
         else if ((active5 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 364, 59);
         return jjMoveStringLiteralDfa5_0(active0, 0x40000000L, active1, 0L, active2, 0L, active3, 0x100000200000L, active4, 0x4000000000000004L, active5, 0x96000L, active6, 0x10022L);
      case 84:
      case 116:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(4, 16, 59);
         else if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(4, 23, 59);
         else if ((active1 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 105, 59);
         else if ((active1 & 0x20000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 117, 59);
         else if ((active1 & 0x40000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 118, 59);
         else if ((active2 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(4, 134, 59);
         else if ((active2 & 0x40000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 182, 59);
         else if ((active3 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(4, 202, 59);
         else if ((active4 & 0x8L) != 0L)
            return jjStartNfaWithStates_0(4, 259, 59);
         else if ((active4 & 0x200000000000L) != 0L)
         {
            jjmatchedKind = 301;
            jjmatchedPos = 4;
         }
         else if ((active5 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(4, 326, 59);
         return jjMoveStringLiteralDfa5_0(active0, 0L, active1, 0x1004040004081L, active2, 0x8000L, active3, 0x10000100L, active4, 0x100000008041L, active5, 0x2ffc00200L, active6, 0x80100000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0L, active1, 0x10000000L, active2, 0x100002000000001L, active3, 0x102000000L, active4, 0x10000000080002L, active5, 0x4001800000000000L, active6, 0L);
      case 87:
      case 119:
         return jjMoveStringLiteralDfa5_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0x2000000L, active5, 0L, active6, 0L);
      case 88:
      case 120:
         if ((active5 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(4, 338, 59);
         return jjMoveStringLiteralDfa5_0(active0, 0L, active1, 0L, active2, 0L, active3, 0x80L, active4, 0x2000L, active5, 0L, active6, 0L);
      case 89:
      case 121:
         if ((active0 & 0x20000000000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 4;
         }
         else if ((active4 & 0x800000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 315, 59);
         else if ((active5 & 0x8L) != 0L)
            return jjStartNfaWithStates_0(4, 323, 59);
         return jjMoveStringLiteralDfa5_0(active0, 0x40000000000L, active1, 0L, active2, 0L, active3, 0L, active4, 0L, active5, 0x100009000L, active6, 0x1000000L);
      case 90:
      case 122:
         return jjMoveStringLiteralDfa5_0(active0, 0L, active1, 0L, active2, 0L, active3, 0x60000L, active4, 0L, active5, 0L, active6, 0L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0, active1, active2, active3, active4, active5, active6, 0L);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0, long old1, long active1, long old2, long active2, long old3, long active3, long old4, long active4, long old5, long active5, long old6, long active6)
{
   if (((active0 &= old0) | (active1 &= old1) | (active2 &= old2) | (active3 &= old3) | (active4 &= old4) | (active5 &= old5) | (active6 &= old6)) == 0L)
      return jjStartNfa_0(3, old0, old1, old2, old3, old4, old5, old6, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0, active1, active2, active3, active4, active5, active6, 0L);
      return 5;
   }
   switch(curChar)
   {
      case 95:
         return jjMoveStringLiteralDfa6_0(active0, 0x40000000000L, active1, 0L, active2, 0L, active3, 0L, active4, 0x1100000000000L, active5, 0L, active6, 0L);
      case 65:
      case 97:
         if ((active6 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(5, 395, 59);
         return jjMoveStringLiteralDfa6_0(active0, 0x8003000L, active1, 0x8000000000000L, active2, 0x80008000080001L, active3, 0x20040100000108L, active4, 0x4000002000000000L, active5, 0x800000280000810L, active6, 0x200L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa6_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0x200000L, active5, 0x100000000000000L, active6, 0L);
      case 67:
      case 99:
         if ((active0 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 45, 59);
         else if ((active3 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(5, 203, 59);
         return jjMoveStringLiteralDfa6_0(active0, 0x8200000004000000L, active1, 0L, active2, 0L, active3, 0x80L, active4, 0x3a000800L, active5, 0x2000000000400L, active6, 0L);
      case 68:
      case 100:
         if ((active0 & 0x40000000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 54, 59);
         else if ((active2 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(5, 142, 59);
         else if ((active2 & 0x4000000000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 190, 59);
         return jjMoveStringLiteralDfa6_0(active0, 0x80000000000000L, active1, 0L, active2, 0x200000000000L, active3, 0L, active4, 0x24000000000000L, active5, 0x5800000000000L, active6, 0L);
      case 69:
      case 101:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(5, 25, 59);
         else if ((active1 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(5, 71, 59);
         else if ((active1 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(5, 78, 59);
         else if ((active1 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(5, 89, 59);
         else if ((active2 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(5, 143, 59);
         else if ((active2 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(5, 145, 59);
         else if ((active2 & 0x20000000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 181, 59);
         else if ((active3 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(5, 217, 59);
         else if ((active3 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(5, 220, 59);
         else if ((active6 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(5, 401, 59);
         return jjMoveStringLiteralDfa6_0(active0, 0x1000000080000L, active1, 0L, active2, 0x6010000000200L, active3, 0x400000L, active4, 0x4000089000L, active5, 0x1L, active6, 0x90008000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa6_0(active0, 0L, active1, 0L, active2, 0L, active3, 0x8000000000000010L, active4, 0L, active5, 0L, active6, 0L);
      case 71:
      case 103:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(5, 10, 59);
         else if ((active1 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 108, 59);
         else if ((active4 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(5, 261, 59);
         return jjMoveStringLiteralDfa6_0(active0, 0L, active1, 0x800000000L, active2, 0L, active3, 0L, active4, 0x80000000000L, active5, 0L, active6, 0x200000L);
      case 72:
      case 104:
         if ((active2 & 0x2000000000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 189, 59);
         return jjMoveStringLiteralDfa6_0(active0, 0L, active1, 0L, active2, 0x200000L, active3, 0L, active4, 0L, active5, 0L, active6, 0L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x20000L, active1, 0x3004000010000L, active2, 0x10000L, active3, 0x2002100000100000L, active4, 0x1002000L, active5, 0x28000100000L, active6, 0x910000L);
      case 76:
      case 108:
         if ((active1 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 104, 59);
         else if ((active2 & 0x1000000000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 188, 59);
         else if ((active4 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 298, 59);
         return jjMoveStringLiteralDfa6_0(active0, 0L, active1, 0L, active2, 0L, active3, 0x200000L, active4, 0x8000800006L, active5, 0x4000000000000000L, active6, 0x402L);
      case 77:
      case 109:
         if ((active3 & 0x1000L) != 0L)
         {
            jjmatchedKind = 204;
            jjmatchedPos = 5;
         }
         return jjMoveStringLiteralDfa6_0(active0, 0L, active1, 0x20000L, active2, 0L, active3, 0x2000L, active4, 0x10400L, active5, 0L, active6, 0L);
      case 78:
      case 110:
         if ((active0 & 0x2000000000000000L) != 0L)
         {
            jjmatchedKind = 61;
            jjmatchedPos = 5;
         }
         else if ((active2 & 0x80000000L) != 0L)
         {
            jjmatchedKind = 159;
            jjmatchedPos = 5;
         }
         else if ((active2 & 0x8000000000000L) != 0L)
         {
            jjmatchedKind = 179;
            jjmatchedPos = 5;
         }
         else if ((active3 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 231, 59);
         else if ((active6 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(5, 402, 59);
         return jjMoveStringLiteralDfa6_0(active0, 0x8800L, active1, 0x200c007aL, active2, 0x10000100000404L, active3, 0x404000000000000L, active4, 0x1a000000000290L, active5, 0x8000012000000002L, active6, 0L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa6_0(active0, 0L, active1, 0x1000L, active2, 0x800000000000800L, active3, 0x60002L, active4, 0x8000000000000000L, active5, 0x400000200000L, active6, 0x40L);
      case 80:
      case 112:
         if ((active2 & 0x100000000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 184, 59);
         return jjMoveStringLiteralDfa6_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0x1c0000000L, active5, 0x10000L, active6, 0L);
      case 82:
      case 114:
         if ((active1 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(5, 74, 59);
         else if ((active1 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(5, 97, 59);
         else if ((active3 & 0x100000000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 248, 59);
         else if ((active5 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 363, 59);
         else if ((active6 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(5, 398, 59);
         return jjMoveStringLiteralDfa6_0(active0, 0x400800000000L, active1, 0x2101L, active2, 0x180000000020L, active3, 0x8200L, active4, 0x124001L, active5, 0x280000000000200L, active6, 0L);
      case 83:
      case 115:
         if ((active1 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(5, 94, 59);
         else if ((active3 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(5, 223, 59);
         else if ((active6 & 0x20L) != 0L)
         {
            jjmatchedKind = 389;
            jjmatchedPos = 5;
         }
         return jjMoveStringLiteralDfa6_0(active0, 0L, active1, 0x280000000000004L, active2, 0x1040000000000L, active3, 0x4200000000000000L, active4, 0x600000100L, active5, 0x7fc88000L, active6, 0L);
      case 84:
      case 116:
         if ((active0 & 0x200000L) != 0L)
         {
            jjmatchedKind = 21;
            jjmatchedPos = 5;
         }
         else if ((active0 & 0x4000000000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 62, 59);
         else if ((active1 & 0x4000000L) != 0L)
         {
            jjmatchedKind = 90;
            jjmatchedPos = 5;
         }
         else if ((active1 & 0x100000000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 120, 59);
         else if ((active2 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(5, 154, 59);
         else if ((active2 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 165, 59);
         else if ((active2 & 0x8000000000000000L) != 0L)
         {
            jjmatchedKind = 191;
            jjmatchedPos = 5;
         }
         else if ((active4 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 292, 59);
         else if ((active5 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(5, 337, 59);
         else if ((active5 & 0x1000000000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 380, 59);
         else if ((active6 & 0x400000L) != 0L)
         {
            jjmatchedKind = 406;
            jjmatchedPos = 5;
         }
         else if ((active6 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(5, 410, 59);
         return jjMoveStringLiteralDfa6_0(active0, 0x1000000040400000L, active1, 0x2000000010000000L, active2, 0x20000000000L, active3, 0xc0200000000001L, active4, 0x40L, active5, 0x408200500007000L, active6, 0x8L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa6_0(active0, 0L, active1, 0L, active2, 0L, active3, 0x10000000000L, active4, 0x400800000000L, active5, 0L, active6, 0L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa6_0(active0, 0L, active1, 0x400000000000000L, active2, 0L, active3, 0x400000000L, active4, 0x3000000004000000L, active5, 0L, active6, 0L);
      case 87:
      case 119:
         if ((active3 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 230, 59);
         return jjMoveStringLiteralDfa6_0(active0, 0L, active1, 0L, active2, 0L, active3, 0x4000000L, active4, 0x40000000000000L, active5, 0L, active6, 0L);
      case 88:
      case 120:
         return jjMoveStringLiteralDfa6_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0x400000L, active5, 0L, active6, 0L);
      case 89:
      case 121:
         if ((active0 & 0x2000000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 49, 59);
         else if ((active6 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(5, 413, 59);
         break;
      case 90:
      case 122:
         return jjMoveStringLiteralDfa6_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0L, active5, 0L, active6, 0x1000000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0, active1, active2, active3, active4, active5, active6, 0L);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0, long old1, long active1, long old2, long active2, long old3, long active3, long old4, long active4, long old5, long active5, long old6, long active6)
{
   if (((active0 &= old0) | (active1 &= old1) | (active2 &= old2) | (active3 &= old3) | (active4 &= old4) | (active5 &= old5) | (active6 &= old6)) == 0L)
      return jjStartNfa_0(4, old0, old1, old2, old3, old4, old5, old6, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0, active1, active2, active3, active4, active5, active6, 0L);
      return 6;
   }
   switch(curChar)
   {
      case 95:
         return jjMoveStringLiteralDfa7_0(active0, 0L, active1, 0L, active2, 0L, active3, 0x2000L, active4, 0x3000000000000000L, active5, 0L, active6, 0L);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa7_0(active0, 0x40040000800L, active1, 0x402000020000001L, active2, 0L, active3, 0x400000000208000L, active4, 0x1c0000084L, active5, 0x100016000L, active6, 0x2L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa7_0(active0, 0L, active1, 0x10000L, active2, 0L, active3, 0L, active4, 0x100000000000L, active5, 0x280000000L, active6, 0L);
      case 67:
      case 99:
         if ((active3 & 0x2000000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 241, 59);
         else if ((active3 & 0x2000000000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 253, 59);
         return jjMoveStringLiteralDfa7_0(active0, 0L, active1, 0x81000L, active2, 0x80000000000000L, active3, 0L, active4, 0x200000200L, active5, 0L, active6, 0L);
      case 68:
      case 100:
         if ((active2 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(6, 138, 59);
         else if ((active4 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 293, 59);
         else if ((active4 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 294, 59);
         return jjMoveStringLiteralDfa7_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0x10000000000000L, active5, 0L, active6, 0L);
      case 69:
      case 101:
         if ((active0 & 0x1000000000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 60, 59);
         else if ((active1 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(6, 77, 59);
         else if ((active1 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(6, 92, 59);
         else if ((active2 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(6, 149, 59);
         else if ((active2 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 171, 59);
         else if ((active3 & 0x4000000000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 254, 59);
         else if ((active4 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(6, 291, 59);
         else if ((active6 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(6, 408, 59);
         return jjMoveStringLiteralDfa7_0(active0, 0x80000000400000L, active1, 0x200000000000000L, active2, 0x10020L, active3, 0x200000400000080L, active4, 0x8400014000L, active5, 0x1000L, active6, 0x400L);
      case 71:
      case 103:
         if ((active2 & 0x4L) != 0L)
            return jjStartNfaWithStates_0(6, 130, 59);
         else if ((active4 & 0x10L) != 0L)
            return jjStartNfaWithStates_0(6, 260, 59);
         else if ((active4 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 299, 59);
         else if ((active5 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 357, 59);
         else if ((active6 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(6, 405, 59);
         return jjMoveStringLiteralDfa7_0(active0, 0L, active1, 0L, active2, 0x1L, active3, 0L, active4, 0L, active5, 0L, active6, 0L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x400004000000L, active1, 0x2080000000020100L, active2, 0x801060000000000L, active3, 0x80c0000000000011L, active4, 0x64000004900001L, active5, 0xd80007fc00200L, active6, 0x8L);
      case 74:
      case 106:
         return jjMoveStringLiteralDfa7_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0L, active5, 0x100000000000000L, active6, 0L);
      case 76:
      case 108:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(6, 27, 59);
         else if ((active2 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(6, 147, 59);
         else if ((active3 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(6, 224, 59);
         else if ((active3 & 0x20000000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 245, 59);
         else if ((active6 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(6, 390, 59);
         return jjMoveStringLiteralDfa7_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0x200000L, active5, 0x2000000000010L, active6, 0L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa7_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0x4000400000001400L, active5, 0L, active6, 0L);
      case 78:
      case 110:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(6, 13, 59);
         else if ((active0 & 0x1000000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 48, 59);
         else if ((active1 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(6, 99, 59);
         else if ((active3 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(6, 218, 59);
         else if ((active5 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 366, 59);
         else if ((active6 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(6, 407, 59);
         return jjMoveStringLiteralDfa7_0(active0, 0x20000L, active1, 0x40000L, active2, 0x6000000000000L, active3, 0x160202L, active4, 0x1000000L, active5, 0x8000100001L, active6, 0L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa7_0(active0, 0L, active1, 0x4000000000L, active2, 0L, active3, 0L, active4, 0x3a000000L, active5, 0x400000000L, active6, 0x100000L);
      case 80:
      case 112:
         if ((active2 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(6, 137, 59);
         else if ((active4 & 0x8000000000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 319, 59);
         return jjMoveStringLiteralDfa7_0(active0, 0L, active1, 0x4L, active2, 0x8000000000L, active3, 0L, active4, 0L, active5, 0x800000000080000L, active6, 0L);
      case 82:
      case 114:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(6, 12, 59);
         else if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(6, 19, 59);
         else if ((active3 & 0x8L) != 0L)
            return jjStartNfaWithStates_0(6, 195, 59);
         else if ((active3 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(6, 214, 59);
         else if ((active6 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(6, 399, 59);
         else if ((active6 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(6, 412, 59);
         else if ((active6 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(6, 415, 59);
         return jjMoveStringLiteralDfa7_0(active0, 0L, active1, 0L, active2, 0L, active3, 0x200000000000L, active4, 0x1000000088040L, active5, 0x480000000200800L, active6, 0L);
      case 83:
      case 115:
         if ((active2 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(6, 160, 59);
         else if ((active2 & 0x10000000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 180, 59);
         else if ((active5 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 360, 59);
         return jjMoveStringLiteralDfa7_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0x22000L, active5, 0L, active6, 0x200L);
      case 84:
      case 116:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(6, 15, 59);
         else if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(6, 35, 59);
         else if ((active0 & 0x8000000000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 63, 59);
         else if ((active3 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 232, 59);
         else if ((active3 & 0x4000000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 242, 59);
         else if ((active4 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(6, 264, 59);
         else if ((active4 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(6, 278, 59);
         else if ((active4 & 0x8000000000000L) != 0L)
         {
            jjmatchedKind = 307;
            jjmatchedPos = 6;
         }
         else if ((active5 & 0x2L) != 0L)
            return jjStartNfaWithStates_0(6, 321, 59);
         else if ((active5 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(6, 330, 59);
         else if ((active5 & 0x4000000000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 382, 59);
         return jjMoveStringLiteralDfa7_0(active0, 0x200000000000000L, active1, 0x9000000000078L, active2, 0x10000000800L, active3, 0x140000000100L, active4, 0x2000000000002L, active5, 0x8000220000008000L, active6, 0x10000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0L, active1, 0x2L, active2, 0x200000000000L, active3, 0L, active4, 0x800L, active5, 0L, active6, 0L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa7_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0L, active5, 0x200000000000000L, active6, 0L);
      case 89:
      case 121:
         if ((active2 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 172, 59);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0, active1, active2, active3, active4, active5, active6, 0L);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0, long old1, long active1, long old2, long active2, long old3, long active3, long old4, long active4, long old5, long active5, long old6, long active6)
{
   if (((active0 &= old0) | (active1 &= old1) | (active2 &= old2) | (active3 &= old3) | (active4 &= old4) | (active5 &= old5) | (active6 &= old6)) == 0L)
      return jjStartNfa_0(5, old0, old1, old2, old3, old4, old5, old6, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0, active1, active2, active3, active4, active5, active6, 0L);
      return 7;
   }
   switch(curChar)
   {
      case 95:
         return jjMoveStringLiteralDfa8_0(active0, 0L, active1, 0x78L, active2, 0L, active3, 0x2L, active4, 0x2000000000000L, active5, 0x7fc00000L, active6, 0L);
      case 65:
      case 97:
         if ((active1 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(7, 72, 59);
         return jjMoveStringLiteralDfa8_0(active0, 0L, active1, 0x1000L, active2, 0L, active3, 0L, active4, 0x1000000108200L, active5, 0x82200000080000L, active6, 0L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa8_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0x400000000000L, active5, 0x100000000L, active6, 0L);
      case 67:
      case 99:
         if ((active3 & 0x10L) != 0L)
         {
            jjmatchedKind = 196;
            jjmatchedPos = 7;
         }
         else if ((active4 & 0x1L) != 0L)
            return jjStartNfaWithStates_0(7, 256, 59);
         else if ((active5 & 0x4000000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 370, 59);
         return jjMoveStringLiteralDfa8_0(active0, 0L, active1, 0x200000000000000L, active2, 0x6000000000000L, active3, 0x8000000000000000L, active4, 0L, active5, 0x110000L, active6, 0L);
      case 68:
      case 100:
         if ((active0 & 0x80000000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 55, 59);
         else if ((active4 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 295, 59);
         return jjMoveStringLiteralDfa8_0(active0, 0L, active1, 0L, active2, 0x800L, active3, 0L, active4, 0x800000L, active5, 0L, active6, 0L);
      case 69:
      case 101:
         if ((active1 & 0x2L) != 0L)
            return jjStartNfaWithStates_0(7, 65, 59);
         else if ((active1 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(7, 80, 59);
         else if ((active2 & 0x1L) != 0L)
            return jjStartNfaWithStates_0(7, 128, 59);
         else if ((active3 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(7, 200, 59);
         else if ((active3 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 234, 59);
         else if ((active4 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(7, 273, 59);
         else if ((active4 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(7, 277, 59);
         else if ((active5 & 0x200000000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 377, 59);
         else if ((active6 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(7, 393, 59);
         return jjMoveStringLiteralDfa8_0(active0, 0x200000000000000L, active1, 0x40000L, active2, 0x10000000000L, active3, 0x60000L, active4, 0x10000000001400L, active5, 0x100020000000000L, active6, 0L);
      case 71:
      case 103:
         if ((active3 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(7, 212, 59);
         else if ((active5 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 359, 59);
         return jjMoveStringLiteralDfa8_0(active0, 0x40000400000L, active1, 0L, active2, 0x20L, active3, 0L, active4, 0L, active5, 0L, active6, 0x400L);
      case 72:
      case 104:
         return jjMoveStringLiteralDfa8_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0x200000000L, active5, 0x800000000000000L, active6, 0L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa8_0(active0, 0L, active1, 0x1L, active2, 0L, active3, 0x300000000200L, active4, 0x100000000042L, active5, 0x8000000000000010L, active6, 0L);
      case 75:
      case 107:
         if ((active2 & 0x80000000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 183, 59);
         else if ((active4 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(7, 280, 59);
         break;
      case 76:
      case 108:
         if ((active1 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(7, 93, 59);
         else if ((active1 & 0x400000000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 122, 59);
         else if ((active3 & 0x400000000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 250, 59);
         return jjMoveStringLiteralDfa8_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0L, active5, 0x280000000L, active6, 0L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa8_0(active0, 0x44000000L, active1, 0L, active2, 0L, active3, 0xc0000000000000L, active4, 0x38000800L, active5, 0x206000L, active6, 0L);
      case 78:
      case 110:
         if ((active1 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 102, 59);
         else if ((active6 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(7, 404, 59);
         return jjMoveStringLiteralDfa8_0(active0, 0L, active1, 0x20000L, active2, 0x800000000000000L, active3, 0L, active4, 0x60000000000000L, active5, 0x1800000000200L, active6, 0L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa8_0(active0, 0L, active1, 0x2008000000000004L, active2, 0x60000000000L, active3, 0L, active4, 0x4000000L, active5, 0x8000000000000L, active6, 0x10008L);
      case 80:
      case 112:
         if ((active4 & 0x4000000000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 318, 59);
         return jjMoveStringLiteralDfa8_0(active0, 0L, active1, 0L, active2, 0L, active3, 0x80L, active4, 0x1000000002000000L, active5, 0L, active6, 0L);
      case 82:
      case 114:
         if ((active3 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(7, 226, 59);
         else if ((active5 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(7, 354, 59);
         return jjMoveStringLiteralDfa8_0(active0, 0x800L, active1, 0L, active2, 0x200000000000L, active3, 0x8000L, active4, 0x400000080L, active5, 0x8000L, active6, 0L);
      case 83:
      case 115:
         if ((active2 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(7, 144, 59);
         else if ((active2 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 167, 59);
         else if ((active5 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(7, 331, 59);
         else if ((active5 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(7, 332, 59);
         return jjMoveStringLiteralDfa8_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0x2004000000014000L, active5, 0L, active6, 0L);
      case 84:
      case 116:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(7, 17, 59);
         else if ((active1 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(7, 83, 59);
         else if ((active3 & 0x200000000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 249, 59);
         else if ((active5 & 0x1L) != 0L)
            return jjStartNfaWithStates_0(7, 320, 59);
         return jjMoveStringLiteralDfa8_0(active0, 0L, active1, 0x82000000000000L, active2, 0L, active3, 0x200000L, active4, 0x1c0002004L, active5, 0L, active6, 0x2L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa8_0(active0, 0L, active1, 0L, active2, 0L, active3, 0x2000L, active4, 0L, active5, 0L, active6, 0L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa8_0(active0, 0L, active1, 0L, active2, 0x1000000000000L, active3, 0x1L, active4, 0L, active5, 0L, active6, 0L);
      case 89:
      case 121:
         if ((active1 & 0x1000000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 112, 59);
         else if ((active4 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(7, 275, 59);
         else if ((active5 & 0x400000000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 378, 59);
         break;
      case 90:
      case 122:
         return jjMoveStringLiteralDfa8_0(active0, 0x400000000000L, active1, 0L, active2, 0L, active3, 0L, active4, 0L, active5, 0L, active6, 0L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0, active1, active2, active3, active4, active5, active6, 0L);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0, long old1, long active1, long old2, long active2, long old3, long active3, long old4, long active4, long old5, long active5, long old6, long active6)
{
   if (((active0 &= old0) | (active1 &= old1) | (active2 &= old2) | (active3 &= old3) | (active4 &= old4) | (active5 &= old5) | (active6 &= old6)) == 0L)
      return jjStartNfa_0(6, old0, old1, old2, old3, old4, old5, old6, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0, active1, active2, active3, active4, active5, active6, 0L);
      return 8;
   }
   switch(curChar)
   {
      case 95:
         return jjMoveStringLiteralDfa9_0(active0, 0L, active1, 0L, active2, 0L, active3, 0x60000L, active4, 0L, active5, 0L, active6, 0L);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa9_0(active0, 0x400004000000L, active1, 0L, active2, 0L, active3, 0L, active4, 0x2000000000800000L, active5, 0L, active6, 0L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa9_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0x40L, active5, 0x200000000000L, active6, 0L);
      case 67:
      case 99:
         if ((active3 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 237, 59);
         return jjMoveStringLiteralDfa9_0(active0, 0L, active1, 0x40000L, active2, 0L, active3, 0L, active4, 0L, active5, 0x8100000000000000L, active6, 0L);
      case 68:
      case 100:
         if ((active4 & 0x10000000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 308, 59);
         return jjMoveStringLiteralDfa9_0(active0, 0L, active1, 0x8L, active2, 0L, active3, 0L, active4, 0L, active5, 0x4000000L, active6, 0L);
      case 69:
      case 101:
         if ((active1 & 0x2000000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 113, 59);
         else if ((active2 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 173, 59);
         else if ((active2 & 0x1000000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 176, 59);
         else if ((active3 & 0x1L) != 0L)
            return jjStartNfaWithStates_0(8, 192, 59);
         else if ((active3 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(8, 213, 59);
         else if ((active3 & 0x40000000000000L) != 0L)
         {
            jjmatchedKind = 246;
            jjmatchedPos = 8;
         }
         else if ((active5 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(8, 336, 59);
         else if ((active5 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(8, 351, 59);
         else if ((active5 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(8, 353, 59);
         return jjMoveStringLiteralDfa9_0(active0, 0x400000L, active1, 0L, active2, 0x2000000000820L, active3, 0x80000000000000L, active4, 0x400200000800L, active5, 0x200000L, active6, 0x400L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa9_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0L, active5, 0x400000L, active6, 0L);
      case 71:
      case 103:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 42, 59);
         else if ((active4 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 300, 59);
         else if ((active4 & 0x20000000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 309, 59);
         else if ((active4 & 0x40000000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 310, 59);
         else if ((active5 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(8, 329, 59);
         else if ((active5 & 0x800000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 367, 59);
         else if ((active5 & 0x1000000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 368, 59);
         break;
      case 72:
      case 104:
         if ((active4 & 0x40000000L) != 0L)
         {
            jjmatchedKind = 286;
            jjmatchedPos = 8;
         }
         return jjMoveStringLiteralDfa9_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0x180000000L, active5, 0x2000000L, active6, 0L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa9_0(active0, 0L, active1, 0x80000000020000L, active2, 0x4000000000000L, active3, 0L, active4, 0x4L, active5, 0x8000L, active6, 0L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa9_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0x100002L, active5, 0x100000000L, active6, 0L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa9_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0L, active5, 0x11000000L, active6, 0L);
      case 78:
      case 110:
         if ((active1 & 0x2000000000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 125, 59);
         else if ((active2 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 169, 59);
         else if ((active2 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 170, 59);
         else if ((active5 & 0x8000000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 371, 59);
         else if ((active6 & 0x8L) != 0L)
            return jjStartNfaWithStates_0(8, 387, 59);
         return jjMoveStringLiteralDfa9_0(active0, 0L, active1, 0x5L, active2, 0L, active3, 0x200L, active4, 0x1000000001400L, active5, 0L, active6, 0L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa9_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0x1000000000000000L, active5, 0L, active6, 0x2L);
      case 80:
      case 112:
         if ((active0 & 0x40000000L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 8;
         }
         return jjMoveStringLiteralDfa9_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0x38010000L, active5, 0x6000L, active6, 0L);
      case 81:
      case 113:
         return jjMoveStringLiteralDfa9_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0L, active5, 0x20000000L, active6, 0L);
      case 82:
      case 114:
         if ((active0 & 0x200000000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 57, 59);
         else if ((active1 & 0x8000000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 115, 59);
         else if ((active2 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 168, 59);
         else if ((active5 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 361, 59);
         return jjMoveStringLiteralDfa9_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0x2000000000000L, active5, 0x2000000100000L, active6, 0x10000L);
      case 83:
      case 115:
         if ((active4 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(8, 269, 59);
         return jjMoveStringLiteralDfa9_0(active0, 0L, active1, 0L, active2, 0L, active3, 0x2000L, active4, 0L, active5, 0x800000L, active6, 0L);
      case 84:
      case 116:
         if ((active1 & 0x200000000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 121, 59);
         else if ((active2 & 0x800000000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 187, 59);
         else if ((active4 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(8, 265, 59);
         else if ((active4 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(8, 270, 59);
         else if ((active4 & 0x4000000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 306, 59);
         return jjMoveStringLiteralDfa9_0(active0, 0L, active1, 0x1030L, active2, 0L, active3, 0x8000000000000080L, active4, 0x8000L, active5, 0x80010L, active6, 0L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa9_0(active0, 0L, active1, 0x40L, active2, 0L, active3, 0x2L, active4, 0x4000000L, active5, 0L, active6, 0L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa9_0(active0, 0L, active1, 0L, active2, 0L, active3, 0x100000000000L, active4, 0x400000000L, active5, 0L, active6, 0L);
      case 87:
      case 119:
         return jjMoveStringLiteralDfa9_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0L, active5, 0x8000000L, active6, 0L);
      case 89:
      case 121:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(8, 11, 59);
         else if ((active3 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(8, 207, 59);
         else if ((active4 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(8, 263, 59);
         else if ((active4 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(8, 281, 59);
         else if ((active5 & 0x800000000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 379, 59);
         return jjMoveStringLiteralDfa9_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0L, active5, 0x80000040000000L, active6, 0L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0, active1, active2, active3, active4, active5, active6, 0L);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0, long old1, long active1, long old2, long active2, long old3, long active3, long old4, long active4, long old5, long active5, long old6, long active6)
{
   if (((active0 &= old0) | (active1 &= old1) | (active2 &= old2) | (active3 &= old3) | (active4 &= old4) | (active5 &= old5) | (active6 &= old6)) == 0L)
      return jjStartNfa_0(7, old0, old1, old2, old3, old4, old5, old6, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0, active1, active2, active3, active4, active5, active6, 0L);
      return 9;
   }
   switch(curChar)
   {
      case 95:
         return jjMoveStringLiteralDfa10_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0L, active5, 0x80000000000000L, active6, 0L);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa10_0(active0, 0L, active1, 0x8L, active2, 0L, active3, 0L, active4, 0x2000000010000L, active5, 0x8002000004002000L, active6, 0L);
      case 68:
      case 100:
         if ((active5 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(9, 341, 59);
         return jjMoveStringLiteralDfa10_0(active0, 0L, active1, 0x4L, active2, 0L, active3, 0L, active4, 0L, active5, 0x4000L, active6, 0L);
      case 69:
      case 101:
         if ((active1 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(9, 76, 59);
         else if ((active3 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(9, 236, 59);
         else if ((active4 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(9, 271, 59);
         else if ((active5 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(9, 352, 59);
         return jjMoveStringLiteralDfa10_0(active0, 0L, active1, 0L, active2, 0L, active3, 0x2000L, active4, 0x400000000L, active5, 0x48900000L, active6, 0L);
      case 71:
      case 103:
         if ((active3 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(9, 201, 59);
         break;
      case 72:
      case 104:
         return jjMoveStringLiteralDfa10_0(active0, 0L, active1, 0L, active2, 0L, active3, 0x20000L, active4, 0L, active5, 0L, active6, 0L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa10_0(active0, 0L, active1, 0x30L, active2, 0L, active3, 0x80L, active4, 0x100002L, active5, 0x1000000L, active6, 0L);
      case 75:
      case 107:
         if ((active4 & 0x1000000000000L) != 0L)
            return jjStartNfaWithStates_0(9, 304, 59);
         break;
      case 76:
      case 108:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(9, 26, 59);
         return jjMoveStringLiteralDfa10_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0x38000000L, active5, 0x200000000000L, active6, 0L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa10_0(active0, 0L, active1, 0L, active2, 0L, active3, 0x40000L, active4, 0x2000000200000000L, active5, 0L, active6, 0L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa10_0(active0, 0L, active1, 0L, active2, 0x4000000000000L, active3, 0L, active4, 0x800L, active5, 0x8000L, active6, 0L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa10_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0x100000004L, active5, 0x12000000L, active6, 0L);
      case 80:
      case 112:
         if ((active2 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(9, 139, 59);
         else if ((active4 & 0x1000000000000000L) != 0L)
            return jjStartNfaWithStates_0(9, 316, 59);
         break;
      case 82:
      case 114:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(9, 22, 59);
         else if ((active4 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(9, 302, 59);
         else if ((active6 & 0x2L) != 0L)
            return jjStartNfaWithStates_0(9, 385, 59);
         return jjMoveStringLiteralDfa10_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0L, active5, 0x400000L, active6, 0L);
      case 83:
      case 115:
         if ((active2 & 0x2000000000000L) != 0L)
            return jjStartNfaWithStates_0(9, 177, 59);
         else if ((active6 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(9, 394, 59);
         return jjMoveStringLiteralDfa10_0(active0, 0L, active1, 0x20040L, active2, 0L, active3, 0x80000000000002L, active4, 0x4000000L, active5, 0L, active6, 0L);
      case 84:
      case 116:
         if ((active1 & 0x1L) != 0L)
            return jjStartNfaWithStates_0(9, 64, 59);
         else if ((active1 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(9, 82, 59);
         else if ((active4 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(9, 266, 59);
         else if ((active4 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(9, 268, 59);
         else if ((active5 & 0x100000000000000L) != 0L)
            return jjStartNfaWithStates_0(9, 376, 59);
         return jjMoveStringLiteralDfa10_0(active0, 0x400000000000L, active1, 0L, active2, 0L, active3, 0L, active4, 0x800000L, active5, 0x80000L, active6, 0L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa10_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0x40L, active5, 0x20000000L, active6, 0L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa10_0(active0, 0L, active1, 0x80000000000000L, active2, 0L, active3, 0L, active4, 0L, active5, 0L, active6, 0L);
      case 87:
      case 119:
         return jjMoveStringLiteralDfa10_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0x80000000L, active5, 0L, active6, 0L);
      case 88:
      case 120:
         if ((active2 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(9, 133, 59);
         break;
      case 89:
      case 121:
         if ((active5 & 0x10L) != 0L)
            return jjStartNfaWithStates_0(9, 324, 59);
         else if ((active6 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(9, 400, 59);
         return jjMoveStringLiteralDfa10_0(active0, 0L, active1, 0L, active2, 0L, active3, 0x8000000000000000L, active4, 0L, active5, 0L, active6, 0L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0, active1, active2, active3, active4, active5, active6, 0L);
}
private int jjMoveStringLiteralDfa10_0(long old0, long active0, long old1, long active1, long old2, long active2, long old3, long active3, long old4, long active4, long old5, long active5, long old6, long active6)
{
   if (((active0 &= old0) | (active1 &= old1) | (active2 &= old2) | (active3 &= old3) | (active4 &= old4) | (active5 &= old5) | (active6 &= old6)) == 0L)
      return jjStartNfa_0(8, old0, old1, old2, old3, old4, old5, old6, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0, active1, active2, active3, active4, active5, 0L, 0L);
      return 10;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa11_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0L, active5, 0x80000060400000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa11_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0x4010000L, active5, 0x800000L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa11_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0L, active5, 0x2000L);
      case 69:
      case 101:
         if ((active1 & 0x80000000000000L) != 0L)
            return jjStartNfaWithStates_0(10, 119, 59);
         else if ((active4 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(10, 279, 59);
         else if ((active4 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(10, 289, 59);
         else if ((active5 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(10, 365, 59);
         return jjMoveStringLiteralDfa11_0(active0, 0L, active1, 0x40L, active2, 0L, active3, 0x2L, active4, 0x38000000L, active5, 0x8080000L);
      case 71:
      case 103:
         if ((active2 & 0x4000000000000L) != 0L)
            return jjStartNfaWithStates_0(10, 178, 59);
         else if ((active5 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(10, 335, 59);
         break;
      case 73:
      case 105:
         return jjMoveStringLiteralDfa11_0(active0, 0x400000000000L, active1, 0x4L, active2, 0L, active3, 0x40000L, active4, 0L, active5, 0x4000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa11_0(active0, 0L, active1, 0x30L, active2, 0L, active3, 0L, active4, 0L, active5, 0x100000L);
      case 78:
      case 110:
         if ((active4 & 0x4L) != 0L)
            return jjStartNfaWithStates_0(10, 258, 59);
         return jjMoveStringLiteralDfa11_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0x2000100000000L, active5, 0x11000000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa11_0(active0, 0L, active1, 0L, active2, 0L, active3, 0x20080L, active4, 0L, active5, 0L);
      case 80:
      case 112:
         if ((active4 & 0x2000000000000000L) != 0L)
            return jjStartNfaWithStates_0(10, 317, 59);
         return jjMoveStringLiteralDfa11_0(active0, 0L, active1, 0L, active2, 0L, active3, 0x8000000000000000L, active4, 0L, active5, 0L);
      case 82:
      case 114:
         if ((active3 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(10, 205, 59);
         else if ((active4 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(10, 290, 59);
         return jjMoveStringLiteralDfa11_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0x80000000L, active5, 0L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa11_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0x2L, active5, 0L);
      case 84:
      case 116:
         if ((active4 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(10, 267, 59);
         return jjMoveStringLiteralDfa11_0(active0, 0L, active1, 0x20008L, active2, 0L, active3, 0x80000000000000L, active4, 0x40L, active5, 0x8002000000000000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa11_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0L, active5, 0x2000000L);
      case 89:
      case 121:
         if ((active5 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(10, 346, 59);
         break;
      case 90:
      case 122:
         return jjMoveStringLiteralDfa11_0(active0, 0L, active1, 0L, active2, 0L, active3, 0L, active4, 0x100000L, active5, 0L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0, active1, active2, active3, active4, active5, 0L, 0L);
}
private int jjMoveStringLiteralDfa11_0(long old0, long active0, long old1, long active1, long old2, long active2, long old3, long active3, long old4, long active4, long old5, long active5)
{
   if (((active0 &= old0) | (active1 &= old1) | (active2 &= old2) | (active3 &= old3) | (active4 &= old4) | (active5 &= old5)) == 0L)
      return jjStartNfa_0(9, old0, old1, old2, old3, old4, old5, 0L, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0, active1, 0L, active3, active4, active5, 0L, 0L);
      return 11;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa12_0(active0, 0L, active1, 0L, active3, 0x80000000000000L, active4, 0L, active5, 0L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa12_0(active0, 0L, active1, 0L, active3, 0L, active4, 0L, active5, 0x400000L);
      case 68:
      case 100:
         if ((active5 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(11, 333, 59);
         break;
      case 69:
      case 101:
         if ((active1 & 0x8L) != 0L)
            return jjStartNfaWithStates_0(11, 67, 59);
         else if ((active1 & 0x10L) != 0L)
         {
            jjmatchedKind = 68;
            jjmatchedPos = 11;
         }
         else if ((active3 & 0x8000000000000000L) != 0L)
            return jjStartNfaWithStates_0(11, 255, 59);
         else if ((active4 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(11, 276, 59);
         return jjMoveStringLiteralDfa12_0(active0, 0L, active1, 0x20L, active3, 0L, active4, 0x10040L, active5, 0x8000000000100000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa12_0(active0, 0L, active1, 0L, active3, 0L, active4, 0L, active5, 0x4000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa12_0(active0, 0L, active1, 0L, active3, 0L, active4, 0L, active5, 0x80000000000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa12_0(active0, 0L, active1, 0x20000L, active3, 0L, active4, 0x80000000L, active5, 0x2000000000000L);
      case 75:
      case 107:
         if ((active4 & 0x2000000000000L) != 0L)
            return jjStartNfaWithStates_0(11, 305, 59);
         else if ((active5 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(11, 347, 59);
         break;
      case 76:
      case 108:
         return jjMoveStringLiteralDfa12_0(active0, 0L, active1, 0L, active3, 0L, active4, 0x100000000L, active5, 0L);
      case 78:
      case 110:
         if ((active3 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(11, 199, 59);
         return jjMoveStringLiteralDfa12_0(active0, 0L, active1, 0x4L, active3, 0x40000L, active4, 0L, active5, 0L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa12_0(active0, 0x400000000000L, active1, 0L, active3, 0L, active4, 0x4000000L, active5, 0x800000L);
      case 82:
      case 114:
         if ((active1 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(11, 70, 59);
         else if ((active3 & 0x2L) != 0L)
            return jjStartNfaWithStates_0(11, 193, 59);
         else if ((active5 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(11, 345, 59);
         else if ((active5 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(11, 350, 59);
         return jjMoveStringLiteralDfa12_0(active0, 0L, active1, 0L, active3, 0L, active4, 0L, active5, 0x20080000L);
      case 84:
      case 116:
         if ((active4 & 0x2L) != 0L)
            return jjStartNfaWithStates_0(11, 257, 59);
         return jjMoveStringLiteralDfa12_0(active0, 0L, active1, 0L, active3, 0L, active4, 0x38000000L, active5, 0x10000000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa12_0(active0, 0L, active1, 0L, active3, 0x20000L, active4, 0L, active5, 0x1000000L);
      default :
         break;
   }
   return jjStartNfa_0(10, active0, active1, 0L, active3, active4, active5, 0L, 0L);
}
private int jjMoveStringLiteralDfa12_0(long old0, long active0, long old1, long active1, long old3, long active3, long old4, long active4, long old5, long active5)
{
   if (((active0 &= old0) | (active1 &= old1) | (active3 &= old3) | (active4 &= old4) | (active5 &= old5)) == 0L)
      return jjStartNfa_0(10, old0, old1, 0L, old3, old4, old5, 0L, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(11, active0, active1, 0L, active3, active4, active5, 0L, 0L);
      return 12;
   }
   switch(curChar)
   {
      case 95:
         return jjMoveStringLiteralDfa13_0(active0, 0L, active1, 0L, active3, 0L, active4, 0L, active5, 0x400000L);
      case 67:
      case 99:
         if ((active1 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(12, 81, 59);
         break;
      case 68:
      case 100:
         if ((active5 & 0x8000000000000000L) != 0L)
            return jjStartNfaWithStates_0(12, 383, 59);
         break;
      case 69:
      case 101:
         if ((active4 & 0x8000000L) != 0L)
         {
            jjmatchedKind = 283;
            jjmatchedPos = 12;
         }
         return jjMoveStringLiteralDfa13_0(active0, 0L, active1, 0L, active3, 0L, active4, 0x30000000L, active5, 0L);
      case 70:
      case 102:
         if ((active5 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(12, 334, 59);
         break;
      case 71:
      case 103:
         if ((active1 & 0x4L) != 0L)
            return jjStartNfaWithStates_0(12, 66, 59);
         else if ((active5 & 0x80000000000000L) != 0L)
            return jjStartNfaWithStates_0(12, 375, 59);
         break;
      case 72:
      case 104:
         if ((active5 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(12, 348, 59);
         break;
      case 77:
      case 109:
         return jjMoveStringLiteralDfa13_0(active0, 0L, active1, 0L, active3, 0x80000000000000L, active4, 0L, active5, 0L);
      case 78:
      case 110:
         if ((active0 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(12, 46, 59);
         else if ((active5 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(12, 339, 59);
         return jjMoveStringLiteralDfa13_0(active0, 0L, active1, 0L, active3, 0L, active4, 0L, active5, 0x900000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa13_0(active0, 0L, active1, 0L, active3, 0L, active4, 0L, active5, 0x2000000000000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa13_0(active0, 0L, active1, 0L, active3, 0L, active4, 0x4000000L, active5, 0L);
      case 82:
      case 114:
         if ((active3 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(12, 209, 59);
         break;
      case 83:
      case 115:
         if ((active4 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(12, 262, 59);
         else if ((active4 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(12, 272, 59);
         return jjMoveStringLiteralDfa13_0(active0, 0L, active1, 0x20L, active3, 0L, active4, 0L, active5, 0L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa13_0(active0, 0L, active1, 0L, active3, 0L, active4, 0x80000000L, active5, 0x21000000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa13_0(active0, 0L, active1, 0L, active3, 0x40000L, active4, 0L, active5, 0L);
      case 89:
      case 121:
         if ((active4 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(12, 288, 59);
         break;
      default :
         break;
   }
   return jjStartNfa_0(11, active0, active1, 0L, active3, active4, active5, 0L, 0L);
}
private int jjMoveStringLiteralDfa13_0(long old0, long active0, long old1, long active1, long old3, long active3, long old4, long active4, long old5, long active5)
{
   if (((active0 &= old0) | (active1 &= old1) | (active3 &= old3) | (active4 &= old4) | (active5 &= old5)) == 0L)
      return jjStartNfa_0(11, old0, old1, 0L, old3, old4, old5, 0L, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(12, 0L, active1, 0L, active3, active4, active5, 0L, 0L);
      return 13;
   }
   switch(curChar)
   {
      case 68:
      case 100:
         if ((active5 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(13, 343, 59);
         break;
      case 69:
      case 101:
         if ((active4 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(13, 287, 59);
         else if ((active5 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(13, 344, 59);
         return jjMoveStringLiteralDfa14_0(active1, 0L, active3, 0L, active4, 0L, active5, 0x20000000L);
      case 78:
      case 110:
         if ((active5 & 0x2000000000000L) != 0L)
            return jjStartNfaWithStates_0(13, 369, 59);
         break;
      case 79:
      case 111:
         return jjMoveStringLiteralDfa14_0(active1, 0L, active3, 0L, active4, 0x20000000L, active5, 0L);
      case 80:
      case 112:
         if ((active3 & 0x80000000000000L) != 0L)
            return jjStartNfaWithStates_0(13, 247, 59);
         break;
      case 83:
      case 115:
         return jjMoveStringLiteralDfa14_0(active1, 0L, active3, 0L, active4, 0L, active5, 0x400000L);
      case 84:
      case 116:
         if ((active5 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(13, 340, 59);
         return jjMoveStringLiteralDfa14_0(active1, 0x20L, active3, 0x40000L, active4, 0L, active5, 0L);
      case 87:
      case 119:
         return jjMoveStringLiteralDfa14_0(active1, 0L, active3, 0L, active4, 0x10000000L, active5, 0L);
      case 89:
      case 121:
         if ((active4 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(13, 282, 59);
         break;
      default :
         break;
   }
   return jjStartNfa_0(12, 0L, active1, 0L, active3, active4, active5, 0L, 0L);
}
private int jjMoveStringLiteralDfa14_0(long old1, long active1, long old3, long active3, long old4, long active4, long old5, long active5)
{
   if (((active1 &= old1) | (active3 &= old3) | (active4 &= old4) | (active5 &= old5)) == 0L)
      return jjStartNfa_0(12, 0L, old1, 0L, old3, old4, old5, 0L, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(13, 0L, active1, 0L, active3, active4, active5, 0L, 0L);
      return 14;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa15_0(active1, 0x20L, active3, 0L, active4, 0L, active5, 0L);
      case 69:
      case 101:
         if ((active3 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(14, 210, 59);
         return jjMoveStringLiteralDfa15_0(active1, 0L, active3, 0L, active4, 0L, active5, 0x400000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa15_0(active1, 0L, active3, 0L, active4, 0x20000000L, active5, 0L);
      case 82:
      case 114:
         if ((active5 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(14, 349, 59);
         return jjMoveStringLiteralDfa15_0(active1, 0L, active3, 0L, active4, 0x10000000L, active5, 0L);
      default :
         break;
   }
   return jjStartNfa_0(13, 0L, active1, 0L, active3, active4, active5, 0L, 0L);
}
private int jjMoveStringLiteralDfa15_0(long old1, long active1, long old3, long active3, long old4, long active4, long old5, long active5)
{
   if (((active1 &= old1) | (active3 &= old3) | (active4 &= old4) | (active5 &= old5)) == 0L)
      return jjStartNfa_0(13, 0L, old1, 0L, old3, old4, old5, 0L, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(14, 0L, active1, 0L, 0L, active4, active5, 0L, 0L);
      return 15;
   }
   switch(curChar)
   {
      case 67:
      case 99:
         return jjMoveStringLiteralDfa16_0(active1, 0L, active4, 0L, active5, 0x400000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa16_0(active1, 0L, active4, 0x10000000L, active5, 0L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa16_0(active1, 0L, active4, 0x20000000L, active5, 0L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa16_0(active1, 0x20L, active4, 0L, active5, 0L);
      default :
         break;
   }
   return jjStartNfa_0(14, 0L, active1, 0L, 0L, active4, active5, 0L, 0L);
}
private int jjMoveStringLiteralDfa16_0(long old1, long active1, long old4, long active4, long old5, long active5)
{
   if (((active1 &= old1) | (active4 &= old4) | (active5 &= old5)) == 0L)
      return jjStartNfa_0(14, 0L, old1, 0L, 0L, old4, old5, 0L, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(15, 0L, active1, 0L, 0L, active4, active5, 0L, 0L);
      return 16;
   }
   switch(curChar)
   {
      case 79:
      case 111:
         return jjMoveStringLiteralDfa17_0(active1, 0L, active4, 0L, active5, 0x400000L);
      case 80:
      case 112:
         if ((active1 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(16, 69, 59);
         break;
      case 84:
      case 116:
         return jjMoveStringLiteralDfa17_0(active1, 0L, active4, 0x10000000L, active5, 0L);
      case 89:
      case 121:
         if ((active4 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(16, 285, 59);
         break;
      default :
         break;
   }
   return jjStartNfa_0(15, 0L, active1, 0L, 0L, active4, active5, 0L, 0L);
}
private int jjMoveStringLiteralDfa17_0(long old1, long active1, long old4, long active4, long old5, long active5)
{
   if (((active1 &= old1) | (active4 &= old4) | (active5 &= old5)) == 0L)
      return jjStartNfa_0(15, 0L, old1, 0L, 0L, old4, old5, 0L, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(16, 0L, 0L, 0L, 0L, active4, active5, 0L, 0L);
      return 17;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active4 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(17, 284, 59);
         break;
      case 78:
      case 110:
         return jjMoveStringLiteralDfa18_0(active4, 0L, active5, 0x400000L);
      default :
         break;
   }
   return jjStartNfa_0(16, 0L, 0L, 0L, 0L, active4, active5, 0L, 0L);
}
private int jjMoveStringLiteralDfa18_0(long old4, long active4, long old5, long active5)
{
   if (((active4 &= old4) | (active5 &= old5)) == 0L)
      return jjStartNfa_0(16, 0L, 0L, 0L, 0L, old4, old5, 0L, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(17, 0L, 0L, 0L, 0L, 0L, active5, 0L, 0L);
      return 18;
   }
   switch(curChar)
   {
      case 68:
      case 100:
         if ((active5 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(18, 342, 59);
         break;
      default :
         break;
   }
   return jjStartNfa_0(17, 0L, 0L, 0L, 0L, 0L, active5, 0L, 0L);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec3 = {
   0xfffffffffffffffcL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0x7fffffffffffffffL
};
static final long[] jjbitVec4 = {
   0x0L, 0x0L, 0x0L, 0x8000000000000000L
};
static final long[] jjbitVec5 = {
   0x0L, 0xfffffffffffc0000L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec6 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0x3fffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 59;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 12:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 417)
                        kind = 417;
                     jjCheckNAddTwoStates(27, 28);
                  }
                  else if (curChar == 46)
                     jjAddStates(0, 2);
                  else if (curChar == 39)
                     jjCheckNAdd(13);
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(17, 18);
                  else if (curChar == 46)
                     jjAddStates(3, 4);
                  break;
               case 2:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 428)
                        kind = 428;
                     jjCheckNAddStates(5, 8);
                  }
                  else if (curChar == 34)
                     jjCheckNAddStates(9, 12);
                  else if (curChar == 35)
                  {
                     if (kind > 417)
                        kind = 417;
                     jjCheckNAddStates(13, 16);
                  }
                  else if (curChar == 39)
                     jjCheckNAddStates(17, 19);
                  else if (curChar == 46)
                     jjCheckNAdd(4);
                  else if (curChar == 45)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 60:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 417)
                        kind = 417;
                     jjCheckNAddTwoStates(27, 28);
                  }
                  else if (curChar == 46)
                     jjAddStates(0, 2);
                  else if (curChar == 39)
                     jjCheckNAddStates(17, 19);
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(17, 18);
                  else if (curChar == 46)
                     jjAddStates(3, 4);
                  break;
               case 59:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 417)
                        kind = 417;
                     jjCheckNAddTwoStates(27, 28);
                  }
                  else if (curChar == 46)
                     jjAddStates(0, 2);
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(17, 18);
                  else if (curChar == 46)
                     jjAddStates(3, 4);
                  break;
               case 0:
                  if (curChar != 45)
                     break;
                  if (kind > 9)
                     kind = 9;
                  jjCheckNAdd(1);
                  break;
               case 1:
                  if ((0xffffffffffffdbffL & l) == 0L)
                     break;
                  if (kind > 9)
                     kind = 9;
                  jjCheckNAdd(1);
                  break;
               case 3:
                  if (curChar == 46)
                     jjCheckNAdd(4);
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 423)
                     kind = 423;
                  jjCheckNAdd(4);
                  break;
               case 6:
               case 7:
                  if (curChar == 39)
                     jjCheckNAddStates(17, 19);
                  break;
               case 8:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 9:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     jjCheckNAddStates(17, 19);
                  break;
               case 10:
                  if (curChar == 39 && kind > 425)
                     kind = 425;
                  break;
               case 13:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(13, 15);
                  break;
               case 15:
                  if (curChar == 39 && kind > 429)
                     kind = 429;
                  break;
               case 16:
                  if (curChar != 35)
                     break;
                  if (kind > 417)
                     kind = 417;
                  jjCheckNAddStates(13, 16);
                  break;
               case 17:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(17, 18);
                  break;
               case 18:
                  if (curChar == 46)
                     jjAddStates(0, 2);
                  break;
               case 19:
                  if (curChar == 35)
                     jjCheckNAddTwoStates(20, 18);
                  break;
               case 20:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(20, 18);
                  break;
               case 21:
                  if (curChar == 34)
                     jjCheckNAddTwoStates(23, 24);
                  break;
               case 22:
                  if (curChar == 34)
                     jjCheckNAddStates(20, 22);
                  break;
               case 23:
                  if (curChar == 34)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 24:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddStates(20, 22);
                  break;
               case 25:
                  if (curChar == 34)
                     jjCheckNAdd(18);
                  break;
               case 26:
                  if (curChar == 42 && kind > 416)
                     kind = 416;
                  break;
               case 27:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 417)
                     kind = 417;
                  jjCheckNAddTwoStates(27, 28);
                  break;
               case 28:
                  if (curChar == 46)
                     jjAddStates(3, 4);
                  break;
               case 29:
                  if (curChar != 35)
                     break;
                  if (kind > 417)
                     kind = 417;
                  jjCheckNAddTwoStates(28, 30);
                  break;
               case 30:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 417)
                     kind = 417;
                  jjCheckNAddTwoStates(28, 30);
                  break;
               case 31:
                  if (curChar == 34)
                     jjCheckNAddTwoStates(33, 34);
                  break;
               case 32:
                  if (curChar == 34)
                     jjCheckNAddStates(23, 25);
                  break;
               case 33:
                  if (curChar == 34)
                     jjstateSet[jjnewStateCnt++] = 32;
                  break;
               case 34:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddStates(23, 25);
                  break;
               case 35:
                  if (curChar != 34)
                     break;
                  if (kind > 417)
                     kind = 417;
                  jjCheckNAdd(28);
                  break;
               case 36:
                  if (curChar == 34)
                     jjCheckNAddStates(9, 12);
                  break;
               case 37:
                  if (curChar == 34)
                     jjCheckNAddStates(26, 28);
                  break;
               case 38:
                  if (curChar == 34)
                     jjstateSet[jjnewStateCnt++] = 37;
                  break;
               case 39:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddStates(26, 28);
                  break;
               case 40:
                  if (curChar == 34)
                     jjCheckNAddStates(29, 31);
                  break;
               case 41:
                  if (curChar == 34)
                     jjstateSet[jjnewStateCnt++] = 40;
                  break;
               case 42:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddStates(29, 31);
                  break;
               case 51:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 428)
                     kind = 428;
                  jjCheckNAddStates(5, 8);
                  break;
               case 52:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(52, 3);
                  break;
               case 53:
                  if (curChar == 46)
                     jjCheckNAdd(54);
                  break;
               case 54:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(54, 55);
                  break;
               case 56:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(57);
                  break;
               case 57:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 424)
                     kind = 424;
                  jjCheckNAdd(57);
                  break;
               case 58:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 428)
                     kind = 428;
                  jjCheckNAdd(58);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 12:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 417)
                        kind = 417;
                     jjCheckNAddTwoStates(27, 28);
                  }
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(17, 18);
                  break;
               case 2:
                  if ((0x7fffffe87ffffffL & l) != 0L)
                  {
                     if (kind > 417)
                        kind = 417;
                     jjCheckNAddStates(13, 16);
                  }
                  else if (curChar == 123)
                     jjAddStates(32, 35);
                  if ((0x402000004020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 6;
                  else if ((0x100000001000000L & l) != 0L)
                  {
                     if (kind > 429)
                        kind = 429;
                     jjstateSet[jjnewStateCnt++] = 12;
                  }
                  break;
               case 60:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 417)
                        kind = 417;
                     jjCheckNAddTwoStates(27, 28);
                  }
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(17, 18);
                  break;
               case 45:
                  if ((0x10001400100014L & l) != 0L)
                  {
                     if (kind > 422)
                        kind = 422;
                  }
                  else if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 46;
                  else if ((0x4000000040L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 44;
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 49;
                  break;
               case 59:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 417)
                        kind = 417;
                     jjCheckNAddTwoStates(27, 28);
                  }
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(17, 18);
                  break;
               case 1:
                  if (kind > 9)
                     kind = 9;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 5:
                  if ((0x402000004020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 9:
                  jjAddStates(17, 19);
                  break;
               case 11:
                  if ((0x100000001000000L & l) == 0L)
                     break;
                  if (kind > 429)
                     kind = 429;
                  jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 13:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 14:
                  if ((0x7e0000007eL & l) != 0L)
                     jjAddStates(36, 37);
                  break;
               case 16:
                  if ((0x7fffffe87ffffffL & l) == 0L)
                     break;
                  if (kind > 417)
                     kind = 417;
                  jjCheckNAddStates(13, 16);
                  break;
               case 17:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(17, 18);
                  break;
               case 19:
                  if ((0x7fffffe87ffffffL & l) != 0L)
                     jjCheckNAddTwoStates(20, 18);
                  break;
               case 20:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(20, 18);
                  break;
               case 24:
                  jjCheckNAddStates(20, 22);
                  break;
               case 27:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 417)
                     kind = 417;
                  jjCheckNAddTwoStates(27, 28);
                  break;
               case 29:
                  if ((0x7fffffe87ffffffL & l) == 0L)
                     break;
                  if (kind > 417)
                     kind = 417;
                  jjCheckNAddTwoStates(28, 30);
                  break;
               case 30:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 417)
                     kind = 417;
                  jjCheckNAddTwoStates(28, 30);
                  break;
               case 34:
                  jjCheckNAddStates(23, 25);
                  break;
               case 39:
                  jjCheckNAddStates(26, 28);
                  break;
               case 42:
                  jjCheckNAddStates(29, 31);
                  break;
               case 43:
                  if (curChar == 123)
                     jjAddStates(32, 35);
                  break;
               case 44:
                  if ((0x400000004000L & l) != 0L && kind > 420)
                     kind = 420;
                  break;
               case 46:
                  if ((0x40000000400L & l) != 0L && kind > 421)
                     kind = 421;
                  break;
               case 47:
                  if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 46;
                  break;
               case 48:
                  if ((0x10001400100014L & l) != 0L && kind > 422)
                     kind = 422;
                  break;
               case 49:
                  if ((0x8000000080000L & l) != 0L && kind > 422)
                     kind = 422;
                  break;
               case 50:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 49;
                  break;
               case 55:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(38, 39);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 12:
                  if (jjCanMove_1(hiByte, i1, i2, l1, l2))
                     jjCheckNAddTwoStates(17, 18);
                  if (jjCanMove_1(hiByte, i1, i2, l1, l2))
                  {
                     if (kind > 417)
                        kind = 417;
                     jjCheckNAddTwoStates(27, 28);
                  }
                  break;
               case 2:
                  if (!jjCanMove_1(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 417)
                     kind = 417;
                  jjCheckNAddStates(13, 16);
                  break;
               case 60:
                  if (jjCanMove_1(hiByte, i1, i2, l1, l2))
                     jjCheckNAddTwoStates(17, 18);
                  if (jjCanMove_1(hiByte, i1, i2, l1, l2))
                  {
                     if (kind > 417)
                        kind = 417;
                     jjCheckNAddTwoStates(27, 28);
                  }
                  break;
               case 59:
                  if (jjCanMove_1(hiByte, i1, i2, l1, l2))
                     jjCheckNAddTwoStates(17, 18);
                  if (jjCanMove_1(hiByte, i1, i2, l1, l2))
                  {
                     if (kind > 417)
                        kind = 417;
                     jjCheckNAddTwoStates(27, 28);
                  }
                  break;
               case 1:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 9)
                     kind = 9;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 9:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(17, 19);
                  break;
               case 17:
                  if (jjCanMove_1(hiByte, i1, i2, l1, l2))
                     jjCheckNAddTwoStates(17, 18);
                  break;
               case 19:
               case 20:
                  if (jjCanMove_1(hiByte, i1, i2, l1, l2))
                     jjCheckNAddTwoStates(20, 18);
                  break;
               case 24:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjCheckNAddStates(20, 22);
                  break;
               case 27:
                  if (!jjCanMove_1(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 417)
                     kind = 417;
                  jjCheckNAddTwoStates(27, 28);
                  break;
               case 29:
               case 30:
                  if (!jjCanMove_1(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 417)
                     kind = 417;
                  jjCheckNAddTwoStates(28, 30);
                  break;
               case 34:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjCheckNAddStates(23, 25);
                  break;
               case 39:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjCheckNAddStates(26, 28);
                  break;
               case 42:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjCheckNAddStates(29, 31);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 59 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_1(0x80L);
      case 47:
         return jjMoveStringLiteralDfa1_1(0x40L);
      default :
         return 1;
   }
}
private int jjMoveStringLiteralDfa1_1(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(1, 6);
         break;
      case 47:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(1, 7);
         break;
      default :
         return 2;
   }
   return 2;
}
static final int[] jjnextStates = {
   19, 21, 26, 29, 31, 52, 3, 53, 58, 38, 39, 41, 42, 17, 27, 28, 
   18, 8, 9, 10, 23, 24, 25, 33, 34, 35, 38, 39, 25, 41, 42, 35, 
   45, 47, 48, 50, 13, 15, 56, 57, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      default :
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}
private static final boolean jjCanMove_1(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec4[i2] & l2) != 0L);
      case 1:
         return ((jjbitVec5[i2] & l2) != 0L);
      case 255:
         return ((jjbitVec6[i2] & l2) != 0L);
      default :
         if ((jjbitVec3[i1] & l1) != 0L)
            return true;
         return false;
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, "\54", 
"\56", "\50", "\51", "\173", "\175", "\133", "\135", "\75", "\74\76", "\41\75", 
"\74", "\74\75", "\76", "\76\75", "\52", "\57", "\53", "\55", "\77", "\44", "\73", 
"\72", "\174\174", "\46\46", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "IN_MULTI_LINE_COMMENT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0xfffffffffffffc01L, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL, 
   0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffb3f3ffffffffL, 0xffL, 
};
static final long[] jjtoSkip = {
   0x29eL, 0x0L, 0x0L, 0x0L, 
   0x0L, 0x0L, 0x0L, 0x0L, 
};
static final long[] jjtoSpecial = {
   0x280L, 0x0L, 0x0L, 0x0L, 
   0x0L, 0x0L, 0x0L, 0x0L, 
};
static final long[] jjtoMore = {
   0x160L, 0x0L, 0x0L, 0x0L, 
   0x0L, 0x0L, 0x0L, 0x0L, 
};
protected JavaCharStream input_stream;
private final int[] jjrounds = new int[59];
private final int[] jjstateSet = new int[118];
private final StringBuilder jjimage = new StringBuilder();
private StringBuilder image = jjimage;
private int jjimageLen;
private int lengthOfMatch;
protected char curChar;
/** Constructor. */
public SQLParserTokenManager(JavaCharStream stream){
   if (JavaCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public SQLParserTokenManager(JavaCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(JavaCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 59; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(JavaCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 2 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         try { input_stream.backup(0);
            while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
               curChar = input_stream.BeginToken();
         }
         catch (java.io.IOException e1) { continue EOFLoop; }
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         if (jjmatchedPos == 0 && jjmatchedKind > 8)
         {
            jjmatchedKind = 8;
         }
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
           matchedToken.specialToken = specialToken;
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
           {
              matchedToken = jjFillToken();
              if (specialToken == null)
                 specialToken = matchedToken;
              else
              {
                 matchedToken.specialToken = specialToken;
                 specialToken = (specialToken.next = matchedToken);
              }
              SkipLexicalActions(matchedToken);
           }
           else
              SkipLexicalActions(null);
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
        MoreLexicalActions();
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
   }
  }
}

void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 7 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    commentNestingDepth -= 1;
    SwitchTo( commentNestingDepth==0 ? DEFAULT : IN_MULTI_LINE_COMMENT ) ;
         break;
      default :
         break;
   }
}
void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      case 5 :
         image.append(input_stream.GetSuffix(jjimageLen));
         jjimageLen = 0;
         commentNestingDepth = 1 ;
         break;
      case 6 :
         image.append(input_stream.GetSuffix(jjimageLen));
         jjimageLen = 0;
         commentNestingDepth += 1 ;
         break;
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}