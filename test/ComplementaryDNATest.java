import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class ComplementaryDNATest {

  @ParameterizedTest
  @CsvFileSource(resources = "/dna.csv", numLinesToSkip = 1)

  void dna(String dna, String returnValue) {
  assertEquals(returnValue, ComplementaryDNA.Dna(dna));
  }
}