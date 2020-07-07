public class ComplementaryDNA {
  public static String Dna (String helix) {
    helix = helix.replaceAll("[A]", "E");

    helix = helix.replaceAll("[T]", "A");

    helix = helix.replaceAll("[E]", "T");

    helix = helix.replaceAll("[G]", "R");

    helix = helix.replaceAll("[C]", "G");

    helix = helix.replaceAll("[R]", "C");
    return helix;
  }

}
