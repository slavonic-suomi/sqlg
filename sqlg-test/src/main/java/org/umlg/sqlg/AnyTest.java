package org.umlg.sqlg;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.umlg.sqlg.test.sharding.TestSharding;

/**
 * Date: 2014/07/16
 * Time: 12:10 PM
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestSharding.class
//        TestLoadSchema.class
//        TestBatch.class,
//        TestSimpleVertexEdgeGremlin.class
//        TestSharding.class,
//        TestShardingGremlin.class,
//        TestSimpleJoinGremlin.class,
//        TestSimpleVertexEdgeGremlin.class,
//        TestUserSuppliedPKBulkMode.class,
//        TestMultipleIDQuery.class,
//        TestTopologyUpgrade.class,
//        TestGremlinCompileWithHas.class,
//        TestValidateTopology.class,
//        TestGremlinCompileTextPredicate.class
//        TestAndStepBarrier.class
})
public class AnyTest {
}
