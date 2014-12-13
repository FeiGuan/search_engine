package edu.nyu.cs.cs2580;

/**
 * Document with Knowledge
 */
class KnowledgeDocument {
  private DocumentStackOverFlow _doc;
  private String _knowledge="";

  public KnowledgeDocument(DocumentStackOverFlow doc, String knowledge) {
    _doc = doc;
    _knowledge = knowledge;
  }

  public int getDocid() {
    return _doc._docid;
  }
  
  public String getKnowledge() {
    return _knowledge;
  }

  public String asTextResult() {
    StringBuffer buf = new StringBuffer();
    buf.append(_doc._docid).append("\t");
    buf.append(_doc.getTitle()).append("\t");
    buf.append("Vote:").append(_doc.getVote()).append("\t");
    buf.append("PR:").append(_doc.getPageRank()).append("\t");
    buf.append("NV:").append(_doc.getNumViews()).append("\t");
    buf.append("\n").append(_knowledge);
    return buf.toString();
  }

  /**
   * @CS2580: Student should implement {@code asHtmlResult} for final project.
   */
  public String asHtmlResult() {
    StringBuffer buf = new StringBuffer();
    buf.append("{\"id\": ").append(_doc._docid).append(", \"title\": \"")
        .append(_doc.getTitle()).append("\", \"url\": \"")
        .append(_doc.getBaseUrl() + _doc.getName())
        .append("\", \"filePath\": \"")
        .append(_doc.getPathPrefix() + "/" + _doc.getName())
        .append("\", \"knowledge\": ").append(_knowledge).append(", \"pagerank\": ")
        .append(_doc.getPageRank()).append(", \"numviews\": ")
        .append(_doc.getNumViews()).append("}");
    return buf.toString();
  }
}
