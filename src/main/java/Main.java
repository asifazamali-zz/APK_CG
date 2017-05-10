import soot.jimple.toolkits.callgraph.CallGraph;

public class Main {

    public static void main(String[] args) {

//        if (!Config.parseArgs(args)) {
//            return;
//        }
//
//        Config.init();
//        CallGraph cg = Util.generateCG();
//        Util.printCG(cg, System.out);

        generateCGForAPK(
                // TODO @Yuxuan, replace this with your APK path
                "/home/asif/MTP/Experiments/APK_CG/APK_CG/HelloWorld.apk",
                "output",
                "android.jar");

    }

    public static void generateCGForAPK(String apkPath, String outputPath, String sdkPath) {
        String[] args = {"-i", apkPath, "-o", outputPath, "-sdk", sdkPath};
        if (!Config.parseArgs(args)) {
            return;
        }
        Config.init();

        CallGraph cg = Util.generateCG();
        // TODO @Yuxuan, replace this with your cg2dot
        Util.printCG(cg, Config.getResultPs());
    }
}
