/**
 * Most of the code in the Qalingo project is copyrighted Hoteia and licensed
 * under the Apache License Version 2.0 (release version 0.8.0)
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *                   Copyright (c) Hoteia, 2012-2014
 * http://www.hoteia.com - http://twitter.com/hoteia - contact@hoteia.com
 *
 */
package org.hoteia.qalingo.core.web.mvc.viewbean;

import java.util.List;

import org.hoteia.qalingo.core.util.CoreUtil;

public class SeoDataViewBean extends AbstractViewBean {

    /**
     * Generated UID
     */
    private static final long serialVersionUID = -6094172379811232111L;

    protected String pageTitle;

    protected String currentUrl;
    protected List<String> canonicalUrls;

    protected String metaAuthor;
    protected String metaKeywords;
    protected String metaDescription;

    protected String metaOgTitle;
    protected String metaOgDescription;
    protected String metaOgImage;

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public String getCurrentUrl() {
        return currentUrl;
    }

    public void setCurrentUrl(String currentUrl) {
        this.currentUrl = currentUrl;
    }

    public List<String> getCanonicalUrls() {
        return canonicalUrls;
    }

    public void setCanonicalUrls(List<String> canonicalUrls) {
        this.canonicalUrls = canonicalUrls;
    }

    public String getMetaAuthor() {
        return metaAuthor;
    }

    public void setMetaAuthor(String metaAuthor) {
        this.metaAuthor = metaAuthor;
    }

    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    public String getMetaDescription() {
        String metaDescriptionEscape = CoreUtil.removeHtmlTag(metaDescription);
        if(metaDescriptionEscape != null){
            metaDescriptionEscape = metaDescriptionEscape.replaceAll("\"","&quot;");
        }
        return CoreUtil.replaceCarriagReturn(metaDescriptionEscape);
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    public String getMetaOgTitle() {
        String metaOgTitleEscape = metaOgTitle;
        if(metaOgTitleEscape != null){
            metaOgTitleEscape = metaOgTitleEscape.replaceAll("\"","&quot;");
        }
        return metaOgTitleEscape;
    }

    public void setMetaOgTitle(String metaOgTitle) {
        this.metaOgTitle = metaOgTitle;
    }

    public String getMetaOgDescription() {
        // FACEBOOK WILL DISPLAY 300
        String metaOgDescriptionEscape = CoreUtil.removeHtmlTag(metaOgDescription);
        if(metaOgDescriptionEscape != null){
            metaOgDescriptionEscape = metaOgDescriptionEscape.replaceAll("\"","&quot;");
        }
        return CoreUtil.replaceCarriagReturn(metaOgDescriptionEscape);
    }

    public void setMetaOgDescription(String metaOgDescription) {
        this.metaOgDescription = metaOgDescription;
    }

    public String getMetaOgImage() {
        return metaOgImage;
    }

    public void setMetaOgImage(String metaOgImage) {
        this.metaOgImage = metaOgImage;
    }

    @Override
    public String toString() {
        return "SeoDataViewBean [pageTitle=" + pageTitle + ", currentUrl=" + currentUrl + ", canonicalUrls=" + canonicalUrls + ", metaAuthor=" + metaAuthor + ", metaKeywords=" + metaKeywords
                + ", metaDescription=" + metaDescription + ", metaOgTitle=" + metaOgTitle + ", metaOgDescription=" + metaOgDescription + ", metaOgImage=" + metaOgImage + "]";
    }

}