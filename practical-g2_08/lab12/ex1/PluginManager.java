abstract class PluginManager {
	public static IPlugin load(String name) throws Exception {
		System.out.println("/" + name + "/");
		Class<?> c = Class.forName(name);
		return (IPlugin) c.getDeclaredConstructor().newInstance();
	}
}