package br.com.kafkaproducer.helper;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//
//import com.google.gson.Gson;
//
//import br.com.kafkaproducer.entity.Users;
//
public class UsersConverter {
//
//	public static Object[] stringToObject(String jsonString) throws Exception {
//		Gson gson = new Gson();
//		Users[] user = gson.fromJson(jsonString, Users[].class);
//		return user;
//	}
//
//	public static String ListToString(ArrayList<Users> lista) throws Exception {
//		StringBuffer sb = new StringBuffer();
//		for (Users user : lista) {
//			sb.append(user.toString() + ";");
//		}
//
//		return sb.toString();
//	}
//
//	public static String objectToString(Users user) throws Exception {
//
//		StringBuffer sb = new StringBuffer();
//		sb.append(user.toString());
//
//		return sb.toString();
//	}
//
//	public static String convertMapToJson(HashMap<String, Object> map) throws Exception {
//		Gson gson = new Gson();
//		String json = gson.toJson(map);
//		return json;
//	}
//
//	public static ArrayList<Users> stringToList(String jsonString) throws Exception {
//		Users[] objeto = new Gson().fromJson(jsonString, Users[].class);
//
//		ArrayList<Users> lista = new ArrayList<Users>();
//		for (Users users : objeto) {
//			lista.add(users);
//		}
//		return lista;
//	}
//
//	public static ArrayList<Users> objectToArrayList(Object obj) throws Exception {
//		ArrayList<Users> users = new ArrayList<Users>();
//
//		Arrays.asList(obj).forEach(msg -> {
//			users.add((Users) msg);
//		});
//
//		return users;
//	}
//
}
