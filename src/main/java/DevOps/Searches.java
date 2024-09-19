package DevOps;

import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

public class Searches {
    Optional<Fraction> findFirstProperFractionByUserId(String id) {
        return new UsersDatabase().findAll()
                .filter(user -> id.equals(user.getId()))
                .flatMap(user -> user.getFractions().stream()
                        .filter(Objects::nonNull)
                )
                .filter(Fraction::isProper)
                .findFirst();
    }

    Stream<String> findUserIdBySomeProperFraction() {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream()
                        .filter(Objects::nonNull)
                        .anyMatch(Fraction::isProper))
                .map(User::getId);

    }
}
