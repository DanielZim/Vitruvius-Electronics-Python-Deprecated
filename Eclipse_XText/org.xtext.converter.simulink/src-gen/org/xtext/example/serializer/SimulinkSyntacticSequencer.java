/*
 * generated by Xtext 2.13.0
 */
package org.xtext.example.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.services.SimulinkGrammarAccess;

@SuppressWarnings("all")
public class SimulinkSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SimulinkGrammarAccess grammarAccess;
	protected AbstractElementAlias match_MatrixElement_SemicolonKeyword_4_0_a;
	protected AbstractElementAlias match_MatrixElement_SemicolonKeyword_4_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SimulinkGrammarAccess) access;
		match_MatrixElement_SemicolonKeyword_4_0_a = new TokenAlias(true, true, grammarAccess.getMatrixElementAccess().getSemicolonKeyword_4_0());
		match_MatrixElement_SemicolonKeyword_4_0_p = new TokenAlias(true, false, grammarAccess.getMatrixElementAccess().getSemicolonKeyword_4_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_MatrixElement_SemicolonKeyword_4_0_a.equals(syntax))
				emit_MatrixElement_SemicolonKeyword_4_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MatrixElement_SemicolonKeyword_4_0_p.equals(syntax))
				emit_MatrixElement_SemicolonKeyword_4_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ';'*
	 *
	 * This ambiguous syntax occurs at:
	 *     value+=BaseValue (ambiguity) ',' value+=BaseValue
	 *     value+=BaseValue (ambiguity) ']' (rule end)
	 */
	protected void emit_MatrixElement_SemicolonKeyword_4_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'+
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID '[' (ambiguity) ',' value+=BaseValue
	 *     name=ID '[' (ambiguity) ']' (rule end)
	 *     name=ID '[' (ambiguity) value+=BaseValue
	 *     value+=BaseValue (ambiguity) ',' value+=BaseValue
	 *     value+=BaseValue (ambiguity) ']' (rule end)
	 *     value+=BaseValue (ambiguity) value+=BaseValue
	 */
	protected void emit_MatrixElement_SemicolonKeyword_4_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}