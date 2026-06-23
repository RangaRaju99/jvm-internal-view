import java.lang.management.ThreadInfo; public class test { public void foo(ThreadInfo info) { long id = info.getThreadId(); } }
