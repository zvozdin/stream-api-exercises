package stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Collections.max;
import static java.util.Collections.sort;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

public class Stream8 {

  public static List<String> mapToUpperCase(List<String> input) {
    return input.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());
  }

  public static List<Integer> returnSquareRoot(List<Integer> input) {
    return input.stream()
        .map(Math::sqrt)
        .map(Double::intValue)
        .collect(Collectors.toList());
  }

  public static List<Integer> getAgeFromUsers(List<User> users) {
    return users.stream()
        .mapToInt(User::getAge)
        .boxed()
        .collect(Collectors.toList());
  }

  public static List<User> getLimitedUserList(List<User> users, int limit) {
    return users.stream().limit(limit).collect(toList());
  }

  public static Integer countUsersOlderThen25(List<User> users) {
    return Math.toIntExact(users.stream().filter(user -> user.getAge() > 25).count());
  }


//
}
