import java.util.List;

public record Conversion(String base_code, String target_code, float conversion_rate, float conversion_result, List supported_codes) {
}

