/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package com.tmg.androsovych.datahub64.composition.impl;


import com.hybris.datahub.composition.CompositionRuleHandler;
import com.hybris.datahub.domain.CanonicalAttributeDefinition;
import com.hybris.datahub.model.CanonicalItem;
import com.hybris.datahub.model.RawItem;
import com.hybris.datahub.model.CompositionGroup;
import com.hybris.datahub.composition.impl.AbstractCompositionRuleHandler;

public class SampleCompositionHandler extends AbstractCompositionRuleHandler implements CompositionRuleHandler
{
	@Override
	public <T extends CanonicalItem> T compose(final CanonicalAttributeDefinition canonicalAttributeDefinition,
			final CompositionGroup<? extends RawItem> compositionGroup, final T t)
	{
		return null;
	}

	@Override
	public boolean isApplicable(final CanonicalAttributeDefinition canonicalAttributeDefinition)
	{
		return false;
	}
}
