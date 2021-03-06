package edu.illinois.library.cantaloupe.resource.iiif.v2;

import edu.illinois.library.cantaloupe.test.BaseTest;
import org.junit.Test;

import static org.junit.Assert.*;

public class ServiceFeatureTest extends BaseTest {

    @Test
    public void testValues() {
        assertNotNull(ServiceFeature.valueOf("BASE_URI_REDIRECT"));
        assertNotNull(ServiceFeature.valueOf("CANONICAL_LINK_HEADER"));
        assertNotNull(ServiceFeature.valueOf("CORS"));
        assertNotNull(ServiceFeature.valueOf("JSON_LD_MEDIA_TYPE"));
        assertNotNull(ServiceFeature.valueOf("PROFILE_LINK_HEADER"));
        assertNotNull(ServiceFeature.valueOf("SIZE_BY_CONFINED_WIDTH_HEIGHT"));
        assertNotNull(ServiceFeature.valueOf("SIZE_BY_WHITELISTED"));
    }

    @Test
    public void testGetName() {
        assertEquals("baseUriRedirect", ServiceFeature.BASE_URI_REDIRECT.getName());
        assertEquals("canonicalLinkHeader", ServiceFeature.CANONICAL_LINK_HEADER.getName());
        assertEquals("cors", ServiceFeature.CORS.getName());
        assertEquals("jsonldMediaType", ServiceFeature.JSON_LD_MEDIA_TYPE.getName());
        assertEquals("profileLinkHeader", ServiceFeature.PROFILE_LINK_HEADER.getName());
        assertEquals("sizeByConfinedWh", ServiceFeature.SIZE_BY_CONFINED_WIDTH_HEIGHT.getName());
        assertEquals("sizeByWhListed", ServiceFeature.SIZE_BY_WHITELISTED.getName());
    }

    @Test
    public void testToString() {
        assertEquals("baseUriRedirect", ServiceFeature.BASE_URI_REDIRECT.toString());
        assertEquals("canonicalLinkHeader", ServiceFeature.CANONICAL_LINK_HEADER.toString());
        assertEquals("cors", ServiceFeature.CORS.toString());
        assertEquals("jsonldMediaType", ServiceFeature.JSON_LD_MEDIA_TYPE.toString());
        assertEquals("sizeByConfinedWh", ServiceFeature.SIZE_BY_CONFINED_WIDTH_HEIGHT.toString());
        assertEquals("sizeByWhListed", ServiceFeature.SIZE_BY_WHITELISTED.toString());
    }

}
